package com.example.simplenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.simplenoteapp.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var databaseHelper: DatabaseLS
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        binding=ActivitySignupBinding.inflate(layoutInflater)
        databaseHelper= DatabaseLS(this)

        val textView24=findViewById<TextView>(R.id.textView24)

        textView24.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
    private fun signupDatabase(username:String,password:String,phone:Int){
        val insertRowId=databaseHelper.insertUser(username,password,phone)
        if (insertRowId !=-1L){
            Toast.makeText(this,"Signup Successfull!!",Toast.LENGTH_SHORT).show()
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }else{
            Toast.makeText(this,"Signup Failed!!",Toast.LENGTH_SHORT).show()
        }

    }
}