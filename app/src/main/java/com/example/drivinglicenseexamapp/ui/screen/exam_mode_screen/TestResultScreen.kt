package com.example.drivinglicenseexamapp.ui.screen.exam_mode_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drivinglicenseexamapp.R
import com.example.drivinglicenseexamapp.ui.theme.ButtonColor

@Composable
fun TestResultScreen() {

    Column(
        modifier = Modifier.fillMaxSize().systemBarsPadding().padding(24.dp)
    ) {
        Component1()
        Spacer(modifier = Modifier.height(24.dp))
        Component2()
        Component3()
    }

}


@Composable
fun Component1(modifier: Modifier = Modifier) {

       Card(
           colors = CardDefaults.cardColors(containerColor = ButtonColor),
       ) {

           Column(
               //verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier
                   .padding(16.dp)
                   .fillMaxWidth()
           ) {
               Image(
                   painter = painterResource(id = R.drawable.balloons),
                   contentDescription = "",
                   modifier = Modifier
                       .fillMaxWidth(0.5f)
                       .aspectRatio(1f)
               )

               Spacer(modifier = Modifier.height(16.dp))

               Button(
                   onClick = {},
                   modifier = Modifier.fillMaxWidth()
               ) {

                   Text(text = "Play Again")
               }

           }
       }
}

@Composable
fun Component2(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "CORRECT")
                Text(text = "10")
            }

            Spacer(modifier = Modifier.weight(1f))


            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "INCORRECT")
                Text(text = "20")
            }

        }



        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "INCORRECT")
            Text(text = "20")
        }
    }

}

@Composable
fun Component3(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Bottom
    ) {

        Button(
            onClick = {},
            //colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "Show Answer")
        }

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "Close")
        }
    }

}

@Composable
fun Component5(modifier: Modifier = Modifier) {


}


@Preview(showBackground = true)
@Composable
private fun TestScreenPrev() {
    TestResultScreen()
}