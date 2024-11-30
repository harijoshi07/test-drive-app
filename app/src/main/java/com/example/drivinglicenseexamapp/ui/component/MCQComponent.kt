package com.example.drivinglicenseexamapp.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamapp.R
import com.example.drivinglicenseexamapp.data.Mode

@Composable
fun QuestionComponent(
    questionNumber: Int,
    questionText: String? = null,
    questionImageId: Int? = null,
    options: List<String>,
    selectedAnswer: Int?,
    correctAnswer: Int,
    onAnswerSelected: (Int) -> Unit,
    mode: Mode
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        if (questionText != null) {
            // Display question text
            Text(
                text = "$questionNumber. $questionText",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        } else if (questionImageId != null) {
            // Display image question
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                     .padding(4.dp)
                ,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,

            ) {
                Text(
                    text = "$questionNumber.",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )

                Image(
                    painter = painterResource(questionImageId),
                    contentDescription = "Question Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp) // Adjust height to fit the image
                )
            }
        }
    }

    options.forEachIndexed { index, option ->
        val isCorrect = index == correctAnswer
        val isSelected = index == selectedAnswer
        AnswerComponent(
            text = option,
            isSelected = isSelected,
            isCorrect = isCorrect,
            showCorrectAnswer = selectedAnswer != null,
            mode = mode,
            onClick = { onAnswerSelected(index) }
        )
    }
    Spacer(modifier = Modifier.height(12.dp))

}


@Composable
fun AnswerComponent(
    text: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    showCorrectAnswer: Boolean,
    mode: Mode,
    onClick: () -> Unit
) {

    val backgroundColor =
        if (mode == Mode.QUIZ_MODE) {
            when {
                isSelected -> Color(0xFF617AD3)
                else -> Color(0xFFEAF3FF)
            }
        } else {
            when {
                showCorrectAnswer && isSelected && isCorrect -> Color(0xFFC7E9A7) // Green for correct selection
                showCorrectAnswer && isSelected && !isCorrect -> Color(0xFFEB8080) // Red for incorrect selection
                showCorrectAnswer && isCorrect -> Color(0xFFC7E9A7) // Green for correct answer
                else -> Color(0xFFEAF3FF) // Transparent gray for unselected answers
            }
        }



    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .height(64.dp),
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(width = 1.dp, color = Color(0xFF83BCFF))

    ) {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 18.sp
        )
    }
}