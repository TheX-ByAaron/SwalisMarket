package com.example.swalismarket.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.swalismarket.R
import com.example.swalismarket.databinding.ActivityChoiceBinding

class ChoiceActivity : AppCompatActivity() {
    private lateinit var binding : ActivityChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_choice)


        binding.buttonLogIn.setOnClickListener{
            intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.continued.setOnClickListener {
            intent = Intent(applicationContext, ClientActivity::class.java)
            startActivity(intent)
            finish()
        }

        setContentView(binding.root)

    }
}