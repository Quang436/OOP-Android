package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khởi tạo basic functionality
        setupBasicEvents_332()
    }

    private fun setupBasicEvents_332() {
        val loginButton_332 = findViewById<Button>(R.id.login_button_332)
        val usernameInput_332 = findViewById<EditText>(R.id.username_input_332)
        val passwordInput_332 = findViewById<EditText>(R.id.password_input_332)
        val statLeft_332 = findViewById<TextView>(R.id.stat_left_332)
        val statRight_332 = findViewById<TextView>(R.id.stat_right_332)

        // Click login button
        loginButton_332.setOnClickListener {
            val username = usernameInput_332.text.toString()
            if (username.isNotEmpty()) {
                Toast.makeText(this, "Welcome $username!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show()
            }
        }

        // Click stats
        statLeft_332.setOnClickListener {
            val current = statLeft_332.text.toString().toIntOrNull() ?: 125
            statLeft_332.text = (current + 1).toString()
        }

        statRight_332.setOnClickListener {
            val current = statRight_332.text.toString().toIntOrNull() ?: 250
            statRight_332.text = (current + 1).toString()
        }
    }
}