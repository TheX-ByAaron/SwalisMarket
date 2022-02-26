package com.example.swalismarket.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.swalismarket.R
import com.example.swalismarket.databinding.ActivityClientBinding
import com.gauravk.bubblenavigation.BubbleNavigationConstraintView

class ClientActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClientBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClientBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNav = binding.bottomNav
        val navController =findNavController(R.id.myNavClientHostFragment)

        bottomNav.setUpWithNavController(navController)
    }

    private fun BubbleNavigationConstraintView.setUpWithNavController(navController: NavController){

        val currentPosition = when (navController.currentDestination?.id){
            R.id.nav_home -> { 0 }
            R.id.nav_cart -> { 1 }
            R.id.nav_orders -> { 2 }
            else -> { 3 }
        }

        this.setCurrentActiveItem(currentPosition)
        this.setNavigationChangeListener { view, position ->
            this.setCurrentActiveItem(position)
            when(view.id){
                R.id.nav_home -> {
                    navController.navigate(R.id.nav_home)
                }

                R.id.nav_cart -> {
                    navController.navigate(R.id.nav_cart)
                }

                R.id.nav_orders -> {
                    navController.navigate(R.id.nav_orders)
                }

                else -> {
                    navController.navigate(R.id.nav_profile)
                }
            }
        }

    }
}