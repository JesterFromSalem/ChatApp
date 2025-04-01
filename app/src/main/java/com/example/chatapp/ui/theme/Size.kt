package com.example.chatapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Size(
    val buttonHeight: Dp = 64.dp
)

val LocalSize = compositionLocalOf { Size() }

val MaterialTheme.sizes : Size
    @Composable
    @ReadOnlyComposable
    get() = Size()