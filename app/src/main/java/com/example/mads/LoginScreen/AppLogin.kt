package com.example.mads.LoginScreen

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.mads.MainDashboard.MainDashboard
import com.example.mads.R

class AppLogin : AppCompatActivity() {

    private var button: AppCompatButton? = null

    private val toDashboard by lazy {
        Intent(this, MainDashboard::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        button = findViewById(R.id.loginButton) as? AppCompatButton

        button?.setOnClickListener {
            startActivity(toDashboard)
        }

    }
}