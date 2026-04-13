package com.example.pr4.ui.theme.Components

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
fun OnboardHeader(modifier: Modifier = Modifier) {
    Text(
        text = "Text",
        color = AccentColor
    )
}

@Composable
fun OnboardDescription(modifier: Modifier = Modifier) {
    Text(
        text = "Description",
        color = DescriptionColor
    )
}

@Composable
fun OnboardTextButton(modifier: Modifier = Modifier) {
    TextButton (onClick = {  },
        colors = ButtonDefaults.textButtonColors(
            contentColor = TextButtonColor
        ))
    {
        Text("Click on me")
    }
}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader()
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription()
}

@Preview
@Composable
private fun OnboardTextButtonPreview() {
    OnboardTextButton()
}