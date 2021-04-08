package com.example.calcularnotas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        Handler(
            Looper.getMainLooper()).postDelayed({
            val changeScreen =
                Intent(this, MainActivity::class.java)
            startActivity(changeScreen)
            finish()
        }, 2000)}

}