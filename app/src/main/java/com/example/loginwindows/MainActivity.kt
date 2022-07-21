package com.example.loginwindows

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUserName: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUserName = findViewById(R.id.editTextUserName)
        editTextPassword = findViewById(R.id.editTextPassword)
        button = findViewById(R.id.button)

        button.setOnClickListener{ validate() }


    }

    private fun validate(){

        val login = editTextUserName.text.toString()
        val password = editTextPassword.text.toString()

        if(password == "1234"){

            val intent = Intent(this, AccessGrantedActivity::class.java)
            intent.putExtra("username", login)
            startActivity(intent)

        }else{

            val intent = Intent(this, AccessDeniedActivity::class.java)
            startActivity(intent)

        }
    }

}