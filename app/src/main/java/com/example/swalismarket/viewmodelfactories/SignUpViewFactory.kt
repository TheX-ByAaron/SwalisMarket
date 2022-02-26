package com.example.swalismarket.viewmodelfactories

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.databinding.SignUpFragmentBinding

class SignUpViewFactory(private val binding: SignUpFragmentBinding,
                        private val context : Context
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        TODO("Not yet implemented")
    }
}