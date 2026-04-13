package com.example.pr4.ui.theme.Components

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextInput() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Подсказка") }
    )
}
@Preview
@Composable
private fun TextInputPreview() {
    TextInput()
}