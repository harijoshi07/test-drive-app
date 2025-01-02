package com.example.drivinglicenseexamapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category/{vehicleType}")
    object Study : Screen("study/{vehicleType}/{categoryTitle}")
    object Quiz : Screen("quiz/{vehicleType}")
    object Result : Screen("result")
    object Answer : Screen("answer")  // Add this line
    object UltimateGuide: Screen(route = "ultimate_guide")
}
