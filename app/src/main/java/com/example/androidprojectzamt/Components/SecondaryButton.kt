package com.example.androidprojectzamt.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojectzamt.ui.theme.SecondaryButtonColor

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    secbuttontext: String,
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        border = BorderStroke(1.dp, color = SecondaryButtonColor),
        shape = RoundedCornerShape(15)
    ) {
        Text(
            text = secbuttontext,
            color = SecondaryButtonColor
        )
    }
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton(secbuttontext = "Доп. кнопка", onClick = {}, enabled = true)
}