package com.example.pr4.ui.theme.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojectzamt.ui.theme.ButtonColor
import com.example.androidprojectzamt.ui.theme.ButtonColorText
import com.example.androidprojectzamt.ui.theme.DisabledButtonColor
import com.example.androidprojectzamt.ui.theme.SecondaryButtonColor

@Composable
fun PrimaryButton(modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        colors = ButtonColors(
            containerColor = ButtonColor,
            contentColor = ButtonColorText,
            disabledContentColor = ButtonColorText,
            disabledContainerColor = DisabledButtonColor
        )
    ) {
        Text(
            text = "Button"
        )
    }
}

@Composable
fun SecondaryButton(modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = {},
        border = BorderStroke(1.dp, color = SecondaryButtonColor),
        shape = RoundedCornerShape(15)
    ) {
        Text(
            text = "Secondary Button",
            color = SecondaryButtonColor
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton()
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton()
}