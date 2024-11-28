package com.example.drivinglicenseexamapp.ui.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.ui.component.countIndexed

@Composable
fun TestScreen(
    questions: List<Question>,
    selectedAnswers: List<Int?>,
    navigateToAnswers: () -> Unit
) {
    val correctAnswers = questions.countIndexed { index, question ->
        selectedAnswers.getOrNull(index) == question.correctOptionIndex
    }
    val incorrectAnswers = questions.size - correctAnswers

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEAF3FF))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Quiz Results",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Correct Answers: $correctAnswers",
                fontSize = 20.sp,
                color = Color(0xFF4CAF50), // Green for correct
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Incorrect Answers: $incorrectAnswers",
                fontSize = 20.sp,
                color = Color(0xFFF44336), // Red for incorrect
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = navigateToAnswers,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF617AD3)),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
            ) {
                Text(
                    text = "Show Answers",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Preview
@Composable
private fun TestScreenPreview() {

    TestScreen(
        questions = listOf(
            Question(
                questionText = "जेब्रा क्रसिङ केका लागि प्रयोग गरिन्छ?",
                optionA = "उभिन",
                optionB = "पैदल यात्रीले बाटो काट्न",
                optionC = "गाडी रोक्न",
                optionD = "गाडी कुदाउन",
                correctOptionIndex = 1 // Corresponds to option B ("पैदल यात्रीले बाटो काट्न")
            ),
            Question(
                questionText = "बढी उकालोमा सवारी चलाउँदा कुन गियरमा चलाउनु पर्छ?",
                optionA = "एक गियरमा",
                optionB = "दुई गियरमा",
                optionC = "तीन गियरमा",
                optionD = "चार गियरमा",
                correctOptionIndex = 0
            )
        ),
        selectedAnswers = listOf(1,2,3),
        navigateToAnswers = {}
    )
}
