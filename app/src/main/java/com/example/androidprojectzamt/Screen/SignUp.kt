package com.example.pr5.Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectzamt.ui.theme.ButActive
import com.example.androidprojectzamt.ui.theme.ButInactive
import com.example.androidprojectzamt.ui.theme.Gray

@Composable
fun SignUp(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(
            color = Color.White
        ),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = modifier
                .width(335.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier.height(61.dp)
            )
            Text(
                text = "Добро пожаловать!",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier.height(23.dp)
            )

            Text(
                text = "Войдите, чтобы пользоваться функциями приложения",
                fontSize = 15.sp,
            )
        }

        Column(
            modifier = modifier
                .width(335.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(
                modifier.height(262.dp)
            )

            Text(
                modifier = modifier
                    .height(14.dp),
                text = "Вход по E-mail",
                color = Gray
            )

            Spacer(
                modifier.height(4.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("example@mail.ru") },
                modifier = Modifier
                    .width(340.dp)
                    .height(48.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                enabled = true
            )

            Spacer(
                modifier.height(24.dp)
            )

            Button(
                onClick = { },
                enabled = false,
                modifier = Modifier
                    .width(340.dp)
                    .height(54.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ButActive,
                    contentColor = Color.White,
                    disabledContainerColor = ButInactive,
                    disabledContentColor = Color.White
                )
            ) {
                Text(
                    text = "Далее",
                    fontSize = 16.sp,
                )
            }
        }

        Column(
            modifier = modifier
                .width(335.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier.height(660.dp)
            )

            Text(
                text = "Или войдите с помощью",
                fontSize = 15.sp,
                color = Gray
            )

            Spacer(
                modifier.height(16.dp)
            )

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .width(340.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = ButActive
                ),
                border = BorderStroke(1.5.dp, ButActive)
            ) {
                Text(
                    text = "Войти с Яндекс",
                    fontSize = 15.sp,
                )
            }
        }
    }
}

@Preview
@Composable
private fun SignUpPrev() {
    SignUp()
}