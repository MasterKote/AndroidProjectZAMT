package com.example.pr5.Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign

@Composable
fun SignUp(modifier: Modifier = Modifier) {
    Column( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(start = 20.dp, end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier.height(103.dp)
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
            fontSize = 17.sp
        )

        Spacer(
            modifier.height(68.dp)
        )

        Text(
            modifier = modifier
                .height(14.dp)
                .fillMaxWidth(),
            text = "Вход по E-mail",
            color = Gray
        )

        Spacer(
            modifier.height(4.dp)
        )

        var buttonstate by remember { mutableStateOf("") }

        OutlinedTextField(
            value = buttonstate,
            onValueChange = { buttonstate = it },
            placeholder = { Text("example@mail.ru") },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            enabled = true,
        )

        Spacer(
            modifier.height(32.dp)
        )

        Button(
            onClick = { },
            enabled = buttonstate.isNotEmpty(),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
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


        Spacer(
            modifier.height(238.dp)
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
                .fillMaxWidth()
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
                fontSize = 17.sp,
            )
        }
    }
}

@Preview
@Composable
private fun SignUpPrev() {
    SignUp()
}