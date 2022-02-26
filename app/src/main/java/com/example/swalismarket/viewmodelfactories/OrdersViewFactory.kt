package com.example.swalismarket.viewmodelfactories

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.databinding.OrdersFragmentBinding
import com.example.swalismarket.viewmodels.OrdersViewModel

class OrdersViewFactory(private val binding: OrdersFragmentBinding,
                        private val context : Context
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(OrdersViewModel::class.java)) {
            return OrdersViewModel(binding ,context ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}