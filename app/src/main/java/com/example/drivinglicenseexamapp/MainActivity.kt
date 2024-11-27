package com.example.drivinglicenseexamapp

import QuizModeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.data.getSampleQuestions
import com.example.drivinglicenseexamapp.navigation.AppNavigation
import com.example.drivinglicenseexamapp.ui.screen.HomeScreen
import com.example.drivinglicenseexamapp.ui.component.TopBar
import com.example.drivinglicenseexamapp.ui.screen.CategoryScreen
import com.example.drivinglicenseexamapp.ui.screen.StudyScreen
import com.example.drivinglicenseexamapp.ui.theme.DrivingLicenseExamAppTheme

class MainActivity : ComponentActivity() {

    private var questions: List<Question> = getSampleQuestions()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DrivingLicenseExamAppTheme {
                AppNavigation()
            }
        }
    }
}

