package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class onBoard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board1)

        val textView6=findViewById<TextView>(R.id.textView6)
        val textView5=findViewById<TextView>(R.id.textView5)

        textView6.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, onBoard2::class.java)
            startActivity(intent)
        }
        textView5.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, onBoard3::class.java)
            startActivity(intent)
        }
    }
}