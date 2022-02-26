package com.example.swalismarket.viewmodelfactories

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.databinding.ProfileFragmentBinding
import com.example.swalismarket.viewmodels.ProfileViewModel

class ClientProfileViewFactory(private val binding: ProfileFragmentBinding,
                               private val context : Context
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            return ProfileViewModel(binding ,context ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}