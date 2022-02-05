package com.example.nikeaxentiev

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun toMainPage() {
        startActivity(Intent(this@LoginActivity, Activity3::class.java))
    }

    fun checkData(view: View) {
        val mail_txt = findViewById<EditText>(R.id.txt1)
        val password_txt = findViewById<EditText>(R.id.txt2)
        val mail = mail_txt.text.toString()
        val password = password_txt.text.toString()
        if (mail == "" && password == "") {
            Toast.makeText(this@LoginActivity, "Пожалуйста, введите данные", Toast.LENGTH_SHORT).show()
        }
        else if (mail != "admin" && password != "admin") {
            Toast.makeText(this@LoginActivity, "Вы ввели неверные данные", Toast.LENGTH_SHORT).show()
        }
        else {
            toMainPage()
        }
    }
}