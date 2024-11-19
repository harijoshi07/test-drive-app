package com.example.drivinglicenseexamapp.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuestionComponent(
    questionNumber: Int,
    questionText: String,
    options: List<String>,
    selectedAnswer: Int?,
    correctAnswer: Int,
    onAnswerSelected: (Int) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row {
            Text(
                text = "$questionNumber. ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = questionText,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }

        options.forEachIndexed { index, option ->
            val isCorrect = index == correctAnswer
            val isSelected = index == selectedAnswer
            AnswerComponent(
                text = option,
                isSelected = isSelected,
                isCorrect = isCorrect,
                showCorrectAnswer = selectedAnswer != null,
                onClick = { onAnswerSelected(index) }
            )
        }
    }
}

@Composable
fun AnswerComponent(
    text: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    showCorrectAnswer: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor = when {
        showCorrectAnswer && isSelected && isCorrect -> Color(0xFFC7E9A7) // Green for correct selection
        showCorrectAnswer && isSelected && !isCorrect -> Color(0xFFEB8080) // Red for incorrect selection
        showCorrectAnswer && isCorrect -> Color(0xFFC7E9A7) // Green for the correct answer
        else -> Color(0xFFEAF3FF) // Transparent gray for unselected answers
    }

    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp),
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(width = 1.dp, color = Color(0xFF83BCFF))

    ) {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 16.sp
        )
    }
}