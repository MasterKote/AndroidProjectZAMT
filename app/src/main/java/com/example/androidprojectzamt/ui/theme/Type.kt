package com.example.androidprojectzamt.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidprojectzamt.R

val RobotoFamily = FontFamily(
    Font(R.font.roboto, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_black, FontWeight.Black)
)

data class AppTypography(
    val headingblack128: TextStyle,
    val headingblack96: TextStyle,
    val headingbold36: TextStyle,
    val headingbold24: TextStyle,
    val headingmedium20: TextStyle,
    val subtitlemedium18: TextStyle,
    val subtitlebold16: TextStyle,
    val subtitlemedium16: TextStyle,
    val subtitleregular16: TextStyle,
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headingblack128 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Black,
            fontSize = 128.sp
        ),
        headingblack96 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Black,
            fontSize = 96.sp
        ),
        headingbold36 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp
        ),
        headingbold24 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        ),
        headingmedium20 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
        ),
        subtitlemedium18 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp
        ),
        subtitlebold16 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        ),
        subtitlemedium16 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        ),
        subtitleregular16 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
}