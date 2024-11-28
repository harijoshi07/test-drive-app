package com.example.drivinglicenseexamapp.navigation

import QuizModeScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.drivinglicenseexamapp.QuestionViewModel
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.data.getSampleQuestions
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
                val allQuestions = viewModel.getAllQuestions()
                QuizModeScreen(
                    questions = allQuestions,
                    navigateToResult = { questions, selectedAnswers ->
                        navController.currentBackStackEntry?.savedStateHandle?.set(
                            "questions",
                            questions.toTypedArray()
                        )
                        navController.currentBackStackEntry?.savedStateHandle?.set(
                            "selectedAnswers",
                            selectedAnswers.toTypedArray()
                        )
                        navController.navigate(Screen.Result.route)
                    }
                )
            }

            composable(Screen.Result.route) {
                val questions = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<Array<Question>>("questions")?.toList() ?: emptyList()

                val selectedAnswers = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<Array<Int?>>("selectedAnswers")?.toList() ?: emptyList()

                ResultScreen(
                    questions = questions,
                    selectedAnswers = selectedAnswers
                )
            }


        }

    }
}
