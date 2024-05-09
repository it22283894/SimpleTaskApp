package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val textView18=findViewById<TextView>(R.id.textView18)

        textView18.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}