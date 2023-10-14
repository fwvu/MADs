package com.example.mads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.mads.MainDashboard.AppLogin


class MainActivity : AppCompatActivity() {

    private var button: AppCompatButton? = null

    private val startApp by lazy {
        Intent(this, AppLogin::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.startButton) as? AppCompatButton

        button?.setOnClickListener {
            startActivity(startApp)
        }
    }
}