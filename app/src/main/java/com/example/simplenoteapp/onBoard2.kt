package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class onBoard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)

        val textView9=findViewById<TextView>(R.id.textView9)
        val textView10=findViewById<TextView>(R.id.textView10)

        textView9.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, onBoard3::class.java)
            startActivity(intent)
        }
        textView10.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, onBoard3::class.java)
            startActivity(intent)
        }

    }
}