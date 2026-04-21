package com.example.androidprojectzamt.Screen

import android.widget.ImageButton
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectzamt.R
import com.example.androidprojectzamt.ui.theme.Gray
import com.example.androidprojectzamt.ui.theme.buttonbackcolor

@Composable
fun PlacingAnOrder(modifier: Modifier = Modifier) {
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
                painter = painterResource(id = R.drawable.vector),
                contentDescription = "vector",
                Modifier.size(16.dp)
            )
        }

        Spacer(Modifier.height(24.dp))

        Text(
            text = "Оформление заказа",
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
            text = "Адрес *",
            color = Gray
        )

        Spacer(Modifier.height(4.dp))

        var addressbut by remember { mutableStateOf("") }

        OutlinedTextField(
            value = addressbut,
            onValueChange = { addressbut = it },
            placeholder = { Text("Введите ваш адрес") },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            enabled = true,
        )

        Spacer(Modifier.height(12.dp))
    }
}

@Preview
@Composable
private fun PlacingAnOrderPrev() {
    PlacingAnOrder()
}