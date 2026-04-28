package com.example.pr4.ui.theme.Components

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextInput(hint: String, value: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = { Text(hint)},
        colors = TextFieldDefaults.colors()
    )
}
@Preview
@Composable
private fun TextInputPreview() {
    TextInput("Подсказка", value = "Текст", onValueChange = {})
}