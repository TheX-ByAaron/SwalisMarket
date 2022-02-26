package com.example.swalismarket.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.swalismarket.databinding.ClientHomeFragmentBinding
import com.example.swalismarket.viewmodels.ClientHomeViewModel

class ClientHome : Fragment() {

    private lateinit var binding: ClientHomeFragmentBinding
    private val clientHomeViewModel: ClientHomeViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = ClientHomeFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}