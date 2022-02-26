package com.example.swalismarket.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.R
import com.example.swalismarket.databinding.ShoppingCartFragmentBinding
import com.example.swalismarket.viewmodelfactories.ShoppingCartViewFactory
import com.example.swalismarket.viewmodels.ShoppingCartViewModel

class ShoppingCartFragment : Fragment() {

    private lateinit var binding:ShoppingCartFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.shopping_cart_fragment,container,false)
        binding.lifecycleOwner = this
        val viewModelFactory = ShoppingCartViewFactory( binding ,this.requireActivity())
        val clientShoppingCartViewModel = ViewModelProvider(this, viewModelFactory)[ShoppingCartViewModel::class.java]




        return binding.root
    }


}