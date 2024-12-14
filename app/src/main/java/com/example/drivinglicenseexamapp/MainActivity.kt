package com.example.drivinglicenseexamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.data.getSampleQuestions
import com.example.drivinglicenseexamapp.navigation.AppNavigation
import com.example.drivinglicenseexamapp.ui.screen.TestScreen
import com.example.drivinglicenseexamapp.ui.theme.DrivingLicenseExamAppTheme

class MainActivity : ComponentActivity() {

    private var questions: List<Question> = getSampleQuestions()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DrivingLicenseExamAppTheme {
                //AppNavigation()
                TestScreen()
            }
        }
    }
}

