package com.project.arsalan.notifications

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        val school1 : TextView = findViewById(R.id.school1)
        school1.setText("school1 working")
    }
}
