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

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader("Текст")
}