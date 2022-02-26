package com.example.swalismarket.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.swalismarket.R
import com.example.swalismarket.viewmodels.ClientHomeViewModel

class ClientHome : Fragment() {

    companion object {
        fun newInstance() = ClientHome()
    }

    private lateinit var viewModel: ClientHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.client_home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClientHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}