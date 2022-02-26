package com.example.swalismarket.viewmodelfactories

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.databinding.LoginFragmentBinding
import com.example.swalismarket.viewmodels.SignInViewModel

class SignInViewFactory(private val binding: LoginFragmentBinding,
                        private val context : Context
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(SignInViewModel::class.java)) {
            return SignInViewModel(binding ,context ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}