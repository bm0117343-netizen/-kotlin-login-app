package com.abdalrhman.loginapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = AppBlue,
    onPrimary = Color.White,
    primaryContainer = AppBlueLight,
    onPrimaryContainer = AppBlueDark,
    secondary = AppTeal,
    tertiary = AppTeal,
    background = AppBackground,
    surface = AppSurface,
    onBackground = Color(0xFF1A1C1E),
    onSurface = Color(0xFF1A1C1E),
    onSurfaceVariant = AppTextGrey,
    outline = Color(0xFF9AA3AF),
    error = AppRed
)

@Composable
fun LoginAppTheme(
    // The app always uses the same fixed light colors, no matter
    // whether the phone is in dark mode or light mode. This keeps
    // buttons, links and typed text visible in both modes.
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}
