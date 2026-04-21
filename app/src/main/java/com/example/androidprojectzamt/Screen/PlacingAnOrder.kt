package com.example.androidprojectzamt.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.androidprojectzamt.OrderPaidScreen
import com.example.androidprojectzamt.R
import com.example.androidprojectzamt.ui.theme.ButActive
import com.example.androidprojectzamt.ui.theme.ButInactive
import com.example.androidprojectzamt.ui.theme.buttonbackcolor
import com.example.androidprojectzamt.ui.theme.lightgrey
import com.example.androidprojectzamt.ui.theme.lightgrey2

@Composable
fun PlacingAnOrder(
        navController: androidx.navigation.NavHostController,
        maintext: String,
        text1: String,
        textfieldtext1: String,
        text2: String,
        textfeildtext2: String,
        text3: String,
        textfieldtext3: String,
        text4: String,
        text5: String,
        text6: String,
        buttontext: String,
        icoback: Int,
        iconext: Int,
        icovoice: Int,
        modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(start = 20.dp, end = 26.dp, top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(
            onClick = {;},
            modifier = Modifier
                .size(size = 32.dp)
                .align(Alignment.Start),
            shape = RoundedCornerShape(6.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = buttonbackcolor,
                contentColor = Color.White,
                disabledContainerColor = buttonbackcolor,
                disabledContentColor = Color.White
            )
        ) {
            Image(
                painter = painterResource(id = icoback),
                contentDescription = "back",
                Modifier.size(16.dp)
            )
        }

        Spacer(Modifier.height(24.dp))

        Text(
            text = maintext,
            Modifier.fillMaxWidth(),
            fontWeight = FontWeight(700),
            fontSize = 24.sp,
            lineHeight = 28.sp
        )

        Spacer(Modifier.height(32.dp))

        Text(
            modifier = modifier
                .height(14.dp)
                .fillMaxWidth(),
            text = text1,
            color = lightgrey
        )

        Spacer(Modifier.height(4.dp))

        var addresstext by remember { mutableStateOf("") }

        OutlinedTextField(
            value = addresstext,
            onValueChange = { addresstext = it },
            placeholder = { Text(textfieldtext1) },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            enabled = true,
        )

        Spacer(Modifier.height(12.dp))

        Text(
            modifier = modifier
                .height(14.dp)
                .fillMaxWidth(),
            text = text2,
            color = lightgrey
        )

        Spacer(Modifier.height(4.dp))

        var phonenumbertext by remember { mutableStateOf("") }

        OutlinedTextField(
            value = phonenumbertext,
            onValueChange = { phonenumbertext = it },
            placeholder = { Text(textfeildtext2) },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            enabled = true,
        )

        Spacer(Modifier.height(12.dp))

        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = modifier
                    .height(14.dp),
                text = text3,
                color = lightgrey
            )

            Image(
                painter = painterResource(id = icovoice),
                contentDescription = "voice",
                Modifier.size(width = 24.dp, height = 20.dp)
            )
        }

        Spacer(Modifier.height(4.dp))

        var commenttext by remember { mutableStateOf("") }

        OutlinedTextField(
            value = commenttext,
            onValueChange = { commenttext = it },
            placeholder = { Text(textfieldtext3) },
            modifier = Modifier
                .fillMaxWidth()
                .height(128.dp),
            shape = RoundedCornerShape(12.dp),
            enabled = true,
        )

        Spacer(Modifier.height(143.dp))

        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = modifier
                    .height(20.dp),
                fontWeight = FontWeight(500),
                fontSize = 15.sp,
                text = text4,
                color = lightgrey2
            )

            Image(
                painter = painterResource(id = iconext),
                contentDescription = "next",
                Modifier.size(20.dp)
            )
        }

        Spacer(Modifier.height(16.dp))

        Divider()

        Spacer(Modifier.height(12.dp))

        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = modifier
                    .height(20.dp),
                fontWeight = FontWeight(500),
                fontSize = 17.sp,
                text = text5
            )

            Text(
                modifier = modifier
                    .height(20.dp),
                fontWeight = FontWeight(500),
                fontSize = 17.sp,
                text = text6
            )
        }

        Spacer(Modifier.height(12.dp))

        Button(
            onClick = { navController.navigate(OrderPaidScreen) },
            enabled = phonenumbertext.isNotEmpty() and addresstext.isNotEmpty(),
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
                text = buttontext,
                fontSize = 17.sp,
                fontWeight = FontWeight(600)
            )
        }
    }
}

@Preview
@Composable
private fun PlacingAnOrderPrev() {
    val navController = rememberNavController()
    PlacingAnOrder(
        navController = navController,
        "Оформление заказа",
        "Адрес *",
        "Введите ваш адрес",
        "Телефон *",
        "Введите ваш номер телефона",
        "Комментарий",
        "Можете оставить свои пожелания",
        "Промокод",
        "1 анализ",
        "690 ₽",
        "Заказать",
        R.drawable.back,
        R.drawable.next,
        R.drawable.voice
        )
}