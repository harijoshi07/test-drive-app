package com.example.drivinglicenseexamapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category")
    object Study : Screen("study/{categoryTitle}")
    object Quiz : Screen("quiz")
    object Result : Screen("result")
    object Answer : Screen("answer")  // Add this line
}
