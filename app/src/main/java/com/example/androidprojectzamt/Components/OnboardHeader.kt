package com.example.pr4.ui.theme.Components

import android.R
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidprojectzamt.ui.theme.AccentColor
import com.example.androidprojectzamt.ui.theme.DescriptionColor
import com.example.androidprojectzamt.ui.theme.TextButtonColor

@Composable
fun OnboardHeader(text: String,modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = AccentColor
    )
}

@Composable
fun OnboardDescription(description: String,modifier: Modifier = Modifier) {
    Text(
        text = description,
        color = DescriptionColor
    )
}

@Composable
fun OnboardTextButton(buttontext: String,modifier: Modifier = Modifier) {
    TextButton (onClick = {  },
        colors = ButtonDefaults.textButtonColors(
            contentColor = TextButtonColor
        ))
    {
        Text(buttontext)
    }
}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader("Текст")
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription("Описание")
}

@Preview
@Composable
private fun OnboardTextButtonPreview() {
    OnboardTextButton("Нажми на меня")
}