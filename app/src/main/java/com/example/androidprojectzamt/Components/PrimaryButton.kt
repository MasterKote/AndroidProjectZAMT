package com.example.pr4.ui.theme.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojectzamt.ui.theme.ButtonColor
import com.example.androidprojectzamt.ui.theme.ButtonColorText
import com.example.androidprojectzamt.ui.theme.DisabledButtonColor
import com.example.androidprojectzamt.ui.theme.SecondaryButtonColor

@Composable
fun PrimaryButton(modifier: Modifier = Modifier,
                  buttontext: String,
                  onClick: () -> Unit,
                  enabled: Boolean = true
                  ) {
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
            text = buttontext
        )
    }
}

@Composable
fun SecondaryButton(modifier: Modifier = Modifier,
                    secbuttontext: String,
                    onClick: () -> Unit,
                    enabled: Boolean = true
                    ) {
    OutlinedButton(
        onClick = {},
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
private fun PrimaryButtonPreview() {
    PrimaryButton(buttontext = "Кнопка", onClick = {}, enabled = true)
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton(secbuttontext = "Доп. кнопка", onClick = {}, enabled = true)
}