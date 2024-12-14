package com.example.drivinglicenseexamapp.ui.screen

import androidx.annotation.DrawableRes
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamapp.R

import androidx.compose.runtime.*

@Composable
fun TestScreen() {
    val backgroundColor = Color(0xFFEAF3FF) // Light theme background
    //val cardBackgroundColor = Color(0xFFE9F2FF) // Blueish card color
    val cardBackgroundColor = Color(0xFFDAEAFF) // Blueish card color
    //val buttonColor = Color(0xFF4A90E2) // Consistent blue for buttons
    val buttonColor = Color(0xFF617AD3) // Consistent blue for buttons
    val buttonTextColor = Color.White // White text for buttons

    // State to track the selected mode
    var selectedMode by remember { mutableStateOf("Study Mode") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Header Buttons
        Box(modifier = Modifier.background(color = Color(0xFFDAEAFF))) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                HomeScreenButton(
                    text = "Study Mode",
                    isSelected = selectedMode == "Study Mode",
                    onClick = { selectedMode = "Study Mode" },
                    selectedColor = buttonColor,
                    deselectedColor = backgroundColor,
                    textColor = buttonTextColor
                )
                HomeScreenButton(
                    text = "Exam Mode",
                    isSelected = selectedMode == "Exam Mode",
                    onClick = { selectedMode = "Exam Mode" },
                    selectedColor = buttonColor,
                    deselectedColor = backgroundColor,
                    textColor = buttonTextColor
                )
            }
        }

        // Cards
        HomeScreenCard(
            title = "Bike - Scooter",
            subtitle = "Category A - K",
            icon = R.drawable.bike0, // Replace with your bike icon
            backgroundColor = cardBackgroundColor
        )
        HomeScreenCard(
            title = "Car",
            subtitle = "Category B",
            icon = R.drawable.car1, // Replace with your car icon
            backgroundColor = cardBackgroundColor
        )

        // Ultimate Guide Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(cardBackgroundColor)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "YOUR ULTIMATE GUIDE:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black, modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "from filling the form and preparing for the exam to getting your license in hand, all explained step by step.",
                    fontSize = 12.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Button(
                    onClick = { /* Navigate to guide */ },
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

@Composable
fun HomeScreenButton(
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
fun HomeScreenCard(
    title: String,
    subtitle: String,
    @DrawableRes icon: Int,
    backgroundColor: Color
) {
    Card(
        //elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(backgroundColor)
                .padding(16.dp),
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
private fun PreviewTestScreen() {
    TestScreen()
}
