package com.example.swalismarket.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swalismarket.R
import com.example.swalismarket.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}