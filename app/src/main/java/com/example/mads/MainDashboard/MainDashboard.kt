package com.example.mads.MainDashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import com.example.mads.R
import com.example.mads.models.UserData

class MainDashboard : AppCompatActivity() {

    private var studentNameLabel: AppCompatTextView? = null
    private var studentIDLabel: AppCompatTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)

        studentNameLabel = findViewById(R.id.headerUsername) as? AppCompatTextView
        studentIDLabel = findViewById(R.id.headerStudentID) as? AppCompatTextView

        // Syntax to retrieve a dataClass from your intents
        (intent.extras?.get("userKey") as? UserData).let {data ->
            studentNameLabel?.text = data?.studentName
        }
        (intent.extras?.get("userKey") as? UserData).let {data ->
            studentIDLabel?.text = data?.studentID
        }


    }
}