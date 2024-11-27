package com.example.drivinglicenseexamapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category")
    object Quiz : Screen("quiz")
    object Study : Screen("study")
    object Result : Screen("result")
}
