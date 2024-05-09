package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class onBoard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board3)

        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}