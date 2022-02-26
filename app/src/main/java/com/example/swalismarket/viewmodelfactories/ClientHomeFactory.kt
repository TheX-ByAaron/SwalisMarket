package com.example.swalismarket.viewmodelfactories

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.databinding.ClientHomeFragmentBinding
import com.example.swalismarket.viewmodels.ClientHomeViewModel

class ClientHomeFactory(private val binding: ClientHomeFragmentBinding,
                        private val context : Context
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ClientHomeViewModel::class.java)) {
            return ClientHomeViewModel(binding ,context ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}