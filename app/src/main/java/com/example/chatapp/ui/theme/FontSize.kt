package com.example.chatapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data class FontSize(
    val buttonText: TextUnit = 14.sp,
    val headline: TextUnit = 34.sp,
    val bodyText: TextUnit = 16.sp
)

val LocalFontSize = compositionLocalOf { FontSize() }

val MaterialTheme.fontSize : FontSize
    @Composable
    @ReadOnlyComposable
    get() = FontSize()