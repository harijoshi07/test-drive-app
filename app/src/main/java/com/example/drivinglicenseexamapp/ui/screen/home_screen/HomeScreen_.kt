package com.example.drivinglicenseexamapp.ui.screen.home_screen

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.animation.with
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamapp.R
import androidx.compose.runtime.*
import com.example.drivinglicenseexamapp.data.VehicleType

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HomeScreen_(
    navigateToCategory: (String) -> Unit,
    navigateToQuiz: (String) -> Unit,
    navigateToUltimateGuide: () -> Unit,
) {
    val backgroundColor = Color(0xFFEAF3FF) // Light theme background
    val cardBackgroundColor = Color(0xFFDAEAFF) // Blueish card color
    val buttonColor = Color(0xFF617AD3) // Consistent blue for buttons
    val buttonTextColor = Color.White // White text for buttons

    var selectedMode by remember { mutableStateOf("Study Mode") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                backgroundColor,
                shape = RoundedCornerShape(topStartPercent = 8, topEndPercent = 8)
            )
            .padding(horizontal = 32.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier.height(4.dp))

        Box(
            modifier = Modifier
                .background(
                    color = Color(0xFFDAEAFF),
                    shape = RoundedCornerShape(12.dp)
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                HomeScreenButton_(
                    text = "Study Mode",
                    isSelected = selectedMode == "Study Mode",
                    onClick = { selectedMode = "Study Mode" },
                    selectedColor = buttonColor,
                    deselectedColor = backgroundColor,
                    textColor = buttonTextColor
                )
                HomeScreenButton_(
                    text = "Exam Mode",
                    isSelected = selectedMode == "Exam Mode",
                    onClick = { selectedMode = "Exam Mode" },
                    selectedColor = buttonColor,
                    deselectedColor = backgroundColor,
                    textColor = buttonTextColor
                )
            }
        }

        // Animated content with slide animation
        AnimatedContent(
            targetState = selectedMode,
            transitionSpec = {
                if (targetState == "Study Mode") {
                    slideInHorizontally { -it } with slideOutHorizontally { it }
                } else {
                    slideInHorizontally { it } with slideOutHorizontally { -it }
                }
            }
        ) { mode ->
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                // Vehicle cards
                HomeScreenCard_(
                    title = "Bike - Scooter",
                    subtitle = "Category A - K",
                    icon = R.drawable.bike0,
                    backgroundColor = cardBackgroundColor,
                    onClick = {
                        if (mode == "Study Mode") navigateToCategory(VehicleType.BIKE)
                        else navigateToQuiz(VehicleType.BIKE)
                    }
                )
                HomeScreenCard_(
                    title = "Car",
                    subtitle = "Category B",
                    icon = R.drawable.car1,
                    backgroundColor = cardBackgroundColor,
                    onClick = {
                        if (mode == "Study Mode") navigateToCategory(VehicleType.CAR)
                        else navigateToQuiz(VehicleType.CAR)
                    }
                )

                Card(
                    colors = CardDefaults.cardColors(containerColor = cardBackgroundColor),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(width = 0.25.dp, color = Color(0xFF617AD3)),
                    modifier = Modifier.clickable { }
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Text(
                            text = "YOUR ULTIMATE GUIDE:",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Text(
                            text = "from filling the form and preparing for the exam to getting your license in hand, all explained step by step.",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                        Button(
                            onClick = navigateToUltimateGuide,
                            colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
                        ) {
                            Text(
                                text = "Let's Start",
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun HomeScreenButton_(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    selectedColor: Color,
    deselectedColor: Color,
    textColor: Color
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) selectedColor else deselectedColor
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(horizontal = 4.dp)
    ) {
        Text(
            text = text,
            color = if (isSelected) textColor else selectedColor
        )
    }
}

@Composable
fun HomeScreenCard_(
    title: String,
    subtitle: String,
    @DrawableRes icon: Int,
    backgroundColor: Color,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick, // Use onClick here for better integration
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        border = BorderStroke(width = 0.25.dp, color = Color(0xFF617AD3)),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp) // Add padding outside the card to prevent overlap
    ) {
        Column(
            modifier = Modifier.padding(16.dp), // Only padding here
        ) {
            Column {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = subtitle,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.DarkGray
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Icon(
                painter = painterResource(id = icon),
                contentDescription = title,
                tint = Color.Unspecified,
                modifier = Modifier
                    .height(160.dp)
                    .width(260.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }

    }


}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen_({}, {}, {})
}
