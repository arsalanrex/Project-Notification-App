package com.project.arsalan.notifications

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenActivity : Button = findViewById(R.id.school1)
        btnOpenActivity.setOnClickListener{
             val intent = Intent(this, Display ::class.java)
            startActivity(intent)

    }
    }
}
