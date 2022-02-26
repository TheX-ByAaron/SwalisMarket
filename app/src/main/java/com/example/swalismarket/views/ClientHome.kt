package com.example.swalismarket.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.R
import com.example.swalismarket.databinding.ClientHomeFragmentBinding
import com.example.swalismarket.viewmodelfactories.ClientHomeFactory
import com.example.swalismarket.viewmodels.ClientHomeViewModel

class ClientHome : Fragment() {

    private lateinit var binding: ClientHomeFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater,R.layout.client_home_fragment,container,false)
        binding.lifecycleOwner = this
        val viewModelFactory = ClientHomeFactory( binding ,this.requireActivity())
        val clientHomeViewModel = ViewModelProvider(this, viewModelFactory)[ClientHomeViewModel::class.java]




        return binding.root
    }


}