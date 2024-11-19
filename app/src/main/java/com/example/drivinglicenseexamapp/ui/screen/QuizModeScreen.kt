import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drivinglicenseexamapp.data.Question
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import com.example.drivinglicenseexamapp.ui.component.QuestionComponent
import com.example.drivinglicenseexamapp.ui.screen.ResultScreen

@Composable
fun QuizModeScreen(questions: List<Question>, modifier: Modifier) {
    val randomQuestions = remember { questions.shuffled().take(5) }
    var currentQuestionIndex by remember { mutableStateOf(0) }
    val selectedAnswers =
        remember { mutableStateListOf<Int?>().apply { addAll(List(5) { null }) } }

    var isQuizFinished by remember { mutableStateOf(false) }
    if (isQuizFinished) {
        // Show Result Screen when quiz is finished
        ResultScreen(
            questions = questions,
            selectedAnswers = selectedAnswers,
            modifier = Modifier.fillMaxSize()
        )
    }
     else {
        // Show quiz screen
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color(0xFFEAF3FF))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Display the current question
                QuestionComponent(
                    questionNumber = currentQuestionIndex + 1,
                    questionText = randomQuestions[currentQuestionIndex].questionText,
                    options = listOf(
                        randomQuestions[currentQuestionIndex].optionA,
                        randomQuestions[currentQuestionIndex].optionB,
                        randomQuestions[currentQuestionIndex].optionC,
                        randomQuestions[currentQuestionIndex].optionD
                    ),
                    selectedAnswer = selectedAnswers[currentQuestionIndex],
                    correctAnswer = randomQuestions[currentQuestionIndex].correctOptionIndex,
                    onAnswerSelected = { answer ->
                        selectedAnswers[currentQuestionIndex] = answer
                    }
                )

                Spacer(modifier = Modifier.weight(1f))

                // Navigation Buttons
                if (currentQuestionIndex == randomQuestions.size - 1) {
                    Button(
                        onClick = { isQuizFinished = true }, // Navigate to result screen
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp)
                            .height(56.dp),
                    ) {
                        Text(text = "Submit")
                    }
                } else {
                    Button(
                        onClick = { if (currentQuestionIndex < randomQuestions.size - 1) currentQuestionIndex++ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp)
                            .height(56.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Blue),
                    ) {
                        Text(text = "Next")
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun QuizModeScreenPreview() {
    QuizModeScreen(
        questions = listOf(
            Question(
                questionText = "जेब्रा क्रसिङ केका लागि प्रयोग गरिन्छ?",
                optionA = "उभिन",
                optionB = "पैदल यात्रीले बाटो काट्न",
                optionC = "गाडी रोक्न",
                optionD = "गाडी कुदाउन",
                correctOptionIndex = 1
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
        modifier = Modifier,
    )
}
