package com.abdalrhman.loginapp.data

import android.content.Context
import android.content.SharedPreferences

/**
 * Saves the registered user and the login session on the device
 * using SharedPreferences (local storage, no internet needed).
 *
 * The name shown on the Home screen is fixed and is never edited:
 * it is always DEFAULT_NAME, no matter which account is created.
 */
class UserPreferences(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_EMAIL = "registered_email"
        private const val KEY_PASSWORD = "registered_password"
        private const val KEY_LOGGED_IN = "is_logged_in"

        // The fixed name that appears on the Home screen, exactly as sent.
        // It is not typed in Register and it cannot be changed from the app.
        const val DEFAULT_NAME = "عبدالرحمن محمد الزين"
    }

    fun saveUser(email: String, password: String) {
        prefs.edit()
            .putString(KEY_EMAIL, email)
            .putString(KEY_PASSWORD, password)
            .apply()
    }

    fun isRegistered(): Boolean {
        return prefs.getString(KEY_EMAIL, null) != null
    }

    fun checkLogin(email: String, password: String): Boolean {
        val savedEmail = prefs.getString(KEY_EMAIL, null)
        val savedPassword = prefs.getString(KEY_PASSWORD, null)
        return savedEmail != null &&
            savedEmail == email &&
            savedPassword == password
    }

    fun setLoggedIn(loggedIn: Boolean) {
        prefs.edit()
            .putBoolean(KEY_LOGGED_IN, loggedIn)
            .apply()
    }

    fun isLoggedIn(): Boolean {
        return prefs.getBoolean(KEY_LOGGED_IN, false)
    }

    fun getLoggedInName(): String {
        return DEFAULT_NAME
    }

    fun logout() {
        prefs.edit()
            .putBoolean(KEY_LOGGED_IN, false)
            .apply()
    }
}
