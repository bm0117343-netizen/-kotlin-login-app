package com.abdalrhman.loginapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = AppBlueNight,
    onPrimary = AppBlueNightDark,
    primaryContainer = AppBlueNightContainer,
    onPrimaryContainer = Color.White,
    secondary = AppTeal,
    tertiary = AppTeal,
    background = AppBackgroundNight,
    surface = AppSurfaceNight,
    onBackground = Color.White,
    onSurface = Color.White,
    onSurfaceVariant = Color(0xFFC7C7C7),
    outline = Color(0xFF8A8A8A),
    error = AppRedNight
)

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
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is intentionally OFF: the phone wallpaper must not
    // change the app colors, otherwise buttons and links can turn
    // almost invisible (as happened on some devices).
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
