package com.naimatul.myuasnana

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(this@splashscreen,MainActivity::class.java)
            )
            finish()
        }, 3000)
    }
}