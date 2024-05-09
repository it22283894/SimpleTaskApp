package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //main

        val delayMillis: Long = 3000

        // Post a delayed action to navigate to the next activity
        Handler().postDelayed({
            val intent = Intent(this, onBoard1::class.java)
            startActivity(intent)
            finish() // Optional: finish the current activity to prevent going back to it
        }, delayMillis)
    }
}