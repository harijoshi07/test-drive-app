package com.example.drivinglicenseexamapp.navigation

import QuizModeScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.drivinglicenseexamapp.QuestionViewModel
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.ui.component.TopBar
import com.example.drivinglicenseexamapp.ui.screen.*

@Composable
fun AppNavigation(viewModel: QuestionViewModel = viewModel()) {

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        containerColor = Color(0xFF617AD3)
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToCategory = { navController.navigate(route = Screen.Category.route) },
                    navigateToQuiz = { navController.navigate(route = Screen.Quiz.route) }
                )
            }
            composable(Screen.Category.route) {
                CategoryScreen(
                    navigateToStudy = { categoryTitle ->
                        navController.navigate(route = "study/$categoryTitle")
                        //navController.navigate(route = Screen.Study.route + "/$categoryTitle")
                    },
                )
            }

            composable(Screen.Study.route) { backStackEntry ->
                val categoryTitle = backStackEntry.arguments?.getString("categoryTitle") ?: ""
                val questions = viewModel.getQuestionsByCategory(categoryTitle)
                StudyScreen(questions = questions)
            }

            composable(Screen.Quiz.route) {
                val quizQuestions = viewModel.getQuizQuestions()
                QuizModeScreen(
                    questions = quizQuestions,
                    navigateToResult = { questions, selectedAnswers ->
                        navController.currentBackStackEntry?.savedStateHandle?.apply {
                            set("questions", questions)
                            set("selectedAnswers", selectedAnswers.toList())
                        }
                        navController.navigate(Screen.Result.route)
                    }
                )
            }


            composable(Screen.Result.route) {
                val questions = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Question>>("questions") ?: emptyList()

                val selectedAnswers = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Int?>>("selectedAnswers") ?: emptyList()

                val correctCount = questions.indices.count {
                    selectedAnswers.getOrNull(it) == questions[it].correctOptionIndex
                }

                ResultScreen(
                    correctAnswer = correctCount,
                    size = questions.size,
                    navigateToQuiz = {
                        navController.navigate(Screen.Quiz.route)
                    },
                    navigateToHome = {
                        navController.popBackStack(Screen.Home.route, inclusive = false)
                    },
                    navigateToAnswer = {
                        navController.currentBackStackEntry?.savedStateHandle?.apply {
                            set("questions", questions)
                            set("selectedAnswers", selectedAnswers)
                        }
                        navController.navigate(Screen.Answer.route)

                    }
                )

            }

            composable(Screen.Answer.route) {
                val questions = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Question>>("questions") ?: emptyList()

                val selectedAnswers = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Int?>>("selectedAnswers") ?: emptyList()

                AnswerScreen(
                    questions = questions,
                    selectedAnswers = selectedAnswers
                )
            }



        }

    }
}
