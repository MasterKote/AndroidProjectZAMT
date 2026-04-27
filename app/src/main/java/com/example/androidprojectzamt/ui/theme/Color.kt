package com.example.androidprojectzamt.ui.theme

import android.R
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
//pr4
val AccentColor = Color(0xFF00B712)
val DescriptionColor = Color(0xFF939396)
val TextButtonColor = Color(0xFF57A9FF)
val ButtonColor = Color(0xFF1A6FEE)
val ButtonColorText = Color(0xFFFFFFFF)
val DisabledButtonColor = Color(0xFFC9D4FB)
val SecondaryButtonColor = Color(0xFF1A6FEE)
//pr5
val Gray = Color(0xFF7E7E9A)
val ButInactive = Color(0xFFC9D4FB)
val ButActive = Color(0xFF1A6FEE)
//pr6
val WelcomeScreenBlue = Color(0xFF57A9FF)
val WelcomeScreenGreen = Color(0xFF00B712)
val WelcomeScreenGray = Color(0xFF939396)
//pr9
val buttonbackcolor = Color(0xFFF5F5F9)
val greentext = Color(0xFF00B712)
val bluetext = Color(0xFF1A6FEE)
val lightgrey = Color(0xFF7E7E9A)
val lightgrey2 = Color(0xFF939396)
//pr10
val bottombarnotactive = Color(0xFFB8C1CC)
val bottomnavactive = Color(0xFF1A6FEE)
val whitecolor = Color(0xFFFFFFFF)
//pr7
data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val blacktext1: Color,
    val blacktext2: Color,
    val gray1: Color,
    val gray2: Color,
    val white: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        blacktext1 = Color.Unspecified,
        blacktext2 = Color.Unspecified,
        gray1 = Color.Unspecified,
        gray2 = Color.Unspecified,
        white = Color.Unspecified
    )
}