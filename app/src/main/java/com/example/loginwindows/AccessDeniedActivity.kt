package com.example.loginwindows

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccessDeniedActivity : AppCompatActivity() {

    private lateinit var buttonTryAgain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_access_denied)

        buttonTryAgain = findViewById(R.id.buttonTryAgain)

        buttonTryAgain.setOnClickListener{ volta() }

    }

    private fun volta(){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}