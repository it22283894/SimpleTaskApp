package com.example.simplenoteapp

import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.simplenoteapp.databinding.ActivityLoginBinding
import com.example.simplenoteapp.databinding.ActivitySignupBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var databaseHelper:DatabaseLS
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        databaseHelper= DatabaseLS(this)

        val textView18=findViewById<TextView>(R.id.textView18)

        textView18.setOnClickListener {
            // Create an Intent to navigate to the next activity
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }


        binding.button2.setOnClickListener {
            val loginUsername=binding.editTextTextEmailAddress.text.toString()
            val loginPassword=binding.editTextTextPassword.text.toString()

            loginDatabase(loginUsername,loginPassword)
        }



    }
    private fun loginDatabase(username:String,password:String){
        val userExists=databaseHelper.readUser(username,password)
        if (userExists){
            Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
            val intent=Intent(this,Home::class.java)
            startActivity(intent)
            finish()

        }else{
            Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
        }
    }
}