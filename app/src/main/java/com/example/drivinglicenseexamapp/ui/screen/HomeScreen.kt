package com.example.drivinglicenseexamapp.ui.screen


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamapp.R
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.ui.component.SegmentedButton

@Composable
fun HomeScreen(
    navigateToStudy:()->Unit,
    navigateToQuiz:()->Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEAF3FF)) // Use the background color from the theme
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding( horizontal = 24.dp)
        ) {

            Card(
                colors = CardDefaults.cardColors(
                    //containerColor = Color(0x338E8FF3) //more vibrant & purple
                    containerColor = Color(0x338E8FF3) //bluish
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    //.size(164.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(12),
                border = BorderStroke(width = 1.dp, color = Color(0xFF617AD3))
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "An ultimate guide:\nfrom filling the form and preparing for the exam to getting your license in hand, all explained step by step.",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF617AD3)
                        ),
                        elevation = ButtonDefaults.buttonElevation(8.dp)
                    ) {
                        Text(
                            text = "Let's Start",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            HomeScreenComponent(
                title = "Bike/Scooter",
                category = "Category A/k",
                painter = R.drawable.bike0
            )
            Spacer(modifier = Modifier.height(20.dp))
            HomeScreenComponent(title = "Car", category = "Category B", painter = R.drawable.car1)
        }

    }

}

@Composable
fun HomeScreenComponent(
    title: String,
    category: String,
    painter: Int,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0x338E8FF3)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12),
        border = BorderStroke(width = 1.dp, color = Color(0xFF617AD3))
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = painter),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            )

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, bottom = 12.dp)
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF617AD3)
                    )
                ) {
                    Text(
                        text = "Study Mode",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF617AD3)
                    )
                ) {
                    Text(
                        text = "Exam Mode",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}


@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen({}, {})

}