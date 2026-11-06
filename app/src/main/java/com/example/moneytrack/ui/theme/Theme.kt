package com.example.moneytrack.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = GreenPrimary,
    onPrimary = Color.White,
    primaryContainer = MintBadgeBg,
    onPrimaryContainer = MintBadgeText,
    secondary = GreenPrimaryDark,
    background = Color(0xFFF8FAFC),
    surface = Color.White,
    onBackground = DarkText,
    onSurface = DarkText
)

@Composable
fun CatatUangTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
