package com.example.jastip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)

        var tvSignIn : TextView = findViewById(R.id.tv_sign_in)

        tvSignIn.setOnClickListener {
            val moveIntent = Intent(this@RegistActivity, LoginActivity::class.java)
            startActivity(moveIntent)
        }
    }
}