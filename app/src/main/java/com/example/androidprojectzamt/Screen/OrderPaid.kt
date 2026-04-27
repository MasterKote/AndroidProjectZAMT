package com.example.androidprojectzamt.Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.androidprojectzamt.R
import com.example.androidprojectzamt.Screen.SignUpScreen
import com.example.androidprojectzamt.ui.theme.ButActive
import com.example.androidprojectzamt.ui.theme.ButInactive
import com.example.androidprojectzamt.ui.theme.bluetext
import com.example.androidprojectzamt.ui.theme.greentext
import com.example.androidprojectzamt.ui.theme.lightgrey2

@Composable
fun OpderPaid(
        navController: androidx.navigation.NavHostController,
        maintext: String,
        text1: String,
        text2: String,
        outlinedbuttext: String,
        buttext: String,
        ico: Int,
        modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = maintext,
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            lineHeight = 28.sp
        )

        Spacer(Modifier.height(82.dp))

        Image(
            painter = painterResource(id = ico),
            contentDescription = "ico",
            Modifier.size(width = 204.dp, height = 200.dp)
        )

        Spacer(Modifier.height(30.dp))

        Text(
            text = text1,
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            lineHeight = 28.sp,
            color = greentext
        )

        Spacer(Modifier.height(10.dp))

        Text(
            text = text2,
            color = lightgrey2,
            modifier = modifier
                .size(width = 291.dp, height = 60.dp),
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(10.dp))

        val annotatedString = buildAnnotatedString {
            withStyle(SpanStyle(color = lightgrey2)){
            append("Не забудьте ознакомиться с ")}
            appendInlineContent("icon", "[icon]")
            withStyle(SpanStyle(color = bluetext)) {
                append(" правилами подготовки к сдаче анализов")
            }
        }

        Text(
            text = annotatedString,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 36.dp),
            textAlign = TextAlign.Center,
            style = TextStyle(lineHeight = 20.sp),
            inlineContent = mapOf(
                "icon" to InlineTextContent(
                    Placeholder(16.sp, 16.sp, PlaceholderVerticalAlign.Center)
                ) {
                    Image(
                        painter = painterResource(R.drawable.sheet),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            )
        )

        Spacer(Modifier.height(97.dp))

        OutlinedButton(
            onClick = { },
            modifier = Modifier
                .width(335.dp)
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, ButActive)
        ) {
            Text(
                text = outlinedbuttext,
                color = ButActive,
                fontSize = 16.sp)
        }

        Spacer(Modifier.heightIn(20.dp))

        Button(
            onClick = { navController.navigate(SignUpScreen) },
            modifier = Modifier
                .width(335.dp)
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
                text = buttext,
                fontSize = 17.sp,
                fontWeight = FontWeight(600)
            )
        }
    }
}

@Preview
@Composable
private fun OpderPaidPrev() {
    val navController = rememberNavController()
    OpderPaid(
        navController = navController,
        "Оплата",
        "Ваш заказ успешно оплачен!",
        "Вам осталось дождаться приезда медсестры и сдать анализы. \n" +
                "До скорой встречи!",
        "Чек покупки",
        "На главную",
        R.drawable.kolba
    )
}