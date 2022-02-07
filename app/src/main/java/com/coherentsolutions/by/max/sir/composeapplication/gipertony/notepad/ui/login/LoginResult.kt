package com.coherentsolutions.by.max.sir.composeapplication.gipertony.notepad.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)