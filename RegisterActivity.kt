package com.example.utskarinanrfa

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            Log.d("RegisterActivity", "Register clicked: $name")
            Toast.makeText(this, "Registering $name", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
