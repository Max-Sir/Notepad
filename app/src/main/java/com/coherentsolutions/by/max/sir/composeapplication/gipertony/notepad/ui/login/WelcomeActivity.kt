package com.coherentsolutions.by.max.sir.composeapplication.gipertony.notepad.ui.login

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import com.coherentsolutions.by.max.sir.composeapplication.gipertony.notepad.R
import com.coherentsolutions.by.max.sir.composeapplication.gipertony.notepad.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
    }


    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle(getString(R.string.logout_question))
            .setMessage(getString(R.string.are_you_sure_you_want_to_logout_question))
            .setPositiveButton(getText(R.string.yes)) { dialog, _ ->
                finish()
                dialog.cancel()
            }
            .setNegativeButton(getText(R.string.no)) { dialog, _ ->
                dialog.cancel()
            }
            .create()
            .show()
    }
}