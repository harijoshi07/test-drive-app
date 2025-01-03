package com.example.drivinglicenseexamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.navigation.AppNavigation
import com.example.drivinglicenseexamapp.ui.theme.DrivingLicenseExamAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        enableEdgeToEdge()

        super.onCreate(savedInstanceState)
        setContent {
            DrivingLicenseExamAppTheme {
                AppNavigation()
            }
        }
    }
}

