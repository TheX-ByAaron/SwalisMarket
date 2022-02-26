package com.example.swalismarket.views

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swalismarket.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = getSharedPreferences("SignedIn", Context.MODE_PRIVATE)
        val isSigned = pref.getBoolean("Signed", false)

        if (isSigned) {
            intent = Intent(applicationContext, ClientActivity::class.java)
            startActivity(intent)
            finish()
        }
        else {
            intent = Intent(applicationContext, ChoiceActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}