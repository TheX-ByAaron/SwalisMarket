package com.example.swalismarket.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.swalismarket.databinding.OrdersFragmentBinding
import com.example.swalismarket.viewmodels.OrdersViewModel

class OrdersFragment : Fragment() {


    private lateinit var binding: OrdersFragmentBinding
    private val ordersViewModel: OrdersViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = OrdersFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}