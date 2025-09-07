package com.example.kimyushin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superButton: Button = findViewById(R.id.superButton)
        superButton.setOnClickListener {
            val intent = Intent(this@MainActivity, LandingActivity::class.java)
            startActivity(intent)
        }


        val registerLink: TextView = findViewById(R.id.tv_register_link)
        registerLink.setOnClickListener {
            val intent = Intent(this@MainActivity, SignupActivity::class.java)
            startActivity(intent)

        }
    }
}