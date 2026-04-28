package com.example.androidprojectzamt.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidprojectzamt.ui.theme.DescriptionColor

@Composable
fun OnboardDescription(description: String,modifier: Modifier = Modifier) {
    Text(
        text = description,
        color = DescriptionColor
    )
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription("Описание")
}