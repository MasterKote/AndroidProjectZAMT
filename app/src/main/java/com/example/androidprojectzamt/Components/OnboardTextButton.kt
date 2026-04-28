package com.example.androidprojectzamt.Components

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidprojectzamt.ui.theme.TextButtonColor

@Composable
fun OnboardTextButton(
    buttontext: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    TextButton (onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.textButtonColors(
            contentColor = TextButtonColor
        ))
    {
        Text(buttontext)
    }
}

@Preview
@Composable
private fun OnboardTextButtonPreview() {
    OnboardTextButton("Нажми на меня", onClick = {}, enabled = true)
}