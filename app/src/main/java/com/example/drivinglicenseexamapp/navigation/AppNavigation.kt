package com.example.drivinglicenseexamapp.navigation

import QuizModeScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.drivinglicenseexamapp.data.getSampleQuestions
import com.example.drivinglicenseexamapp.ui.component.TopBar
import com.example.drivinglicenseexamapp.ui.screen.*

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    val questions = getSampleQuestions()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        containerColor = Color(0xFF617AD3)
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Quiz.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToStudy = { navController.navigate(route = Screen.Study.route) },
                    navigateToQuiz = { navController.navigate(route = Screen.Quiz.route) }
                )
            }
            composable(Screen.Category.route) {
                CategoryScreen(
                    navigateToStudy = { navController.navigate(route = Screen.Study.route) },
                    )
            }
            composable(Screen.Quiz.route) {
                QuizModeScreen(
                    questions = questions
                )
            }
            composable(Screen.Study.route) {
                StudyScreen(
                    questions = questions,
                )
            }
            composable(Screen.Result.route) {
                ResultScreen(
                    questions = questions,
                    selectedAnswers = listOf(/* Pass selected answers */),
                )
            }
        }

    }
}
