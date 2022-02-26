package com.example.swalismarket.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.R
import com.example.swalismarket.databinding.OrdersFragmentBinding
import com.example.swalismarket.viewmodelfactories.OrdersViewFactory
import com.example.swalismarket.viewmodels.OrdersViewModel

class OrdersFragment : Fragment() {



    private lateinit var binding: OrdersFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.orders_fragment,container,false)
        binding.lifecycleOwner = this
        val viewModelFactory = OrdersViewFactory( binding ,this.requireActivity())
        val clientOrderListViewModel = ViewModelProvider(this, viewModelFactory)[OrdersViewModel::class.java]



        return inflater.inflate(R.layout.orders_fragment, container, false)
    }



}