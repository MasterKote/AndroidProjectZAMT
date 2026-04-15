package com.example.pr6.screen

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.androidprojectzamt.ui.theme.WelcomeScreenBlue
import com.example.androidprojectzamt.ui.theme.WelcomeScreenGray
import com.example.androidprojectzamt.ui.theme.WelcomeScreenGreen
import com.example.androidprojectzamt.R

@Composable
fun WelcomeScreen(textbut: String, maintext: String,descriptiontext: String,modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .padding(top = 44.dp, start = 30.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(onClick = {}) {
                Text(
                    textbut,
                    color = WelcomeScreenBlue,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                )
                modifier.height(24.dp)
            }
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "plus"
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 273.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                maintext,
                color = WelcomeScreenGreen,
                fontSize = 20.sp,
                fontWeight = FontWeight(600),
            )

            Spacer(Modifier.height(29.dp))

            Text(
                descriptiontext,
                color = WelcomeScreenGray,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
            )

            Spacer(Modifier.height(60.dp))

            Image(
                painter = painterResource(id = R.drawable.kruzochki1),
                contentDescription = "ellipse"
            )

            Spacer(Modifier.height(106.dp))

            Image(
                painter = painterResource(id = R.drawable.kolba),
                contentDescription = "main_picture",
                modifier = Modifier
                //.size(width = 366.dp, height = 217.dp) //doc 1
                //.size(width = 359.dp, height = 269.dp) //doc 2
            )
        }
    }
}
@Preview
@Composable
private fun WelcomeScreenPrev() {
    WelcomeScreen("Далее", "Анализы", "Экспресс сбор и получение проб")
}