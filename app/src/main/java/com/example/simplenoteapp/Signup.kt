package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val textView24=findViewById<TextView>(R.id.textView24)

        textView24.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}