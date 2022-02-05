package com.example.nikeaxentiev

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    public fun toLogin(view:View) {
        startActivity(Intent(this@Activity2, LoginActivity::class.java))
    }
}