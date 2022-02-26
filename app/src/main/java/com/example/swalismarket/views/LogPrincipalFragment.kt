package com.example.swalismarket.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.swalismarket.R
import com.example.swalismarket.databinding.LogPrincipalFragmentBinding
import com.example.swalismarket.viewmodels.LogPrincipalViewModel

class LogPrincipalFragment : Fragment() {

    private lateinit var binding: LogPrincipalFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater,R.layout.log_principal_fragment,container,false)





        return binding.root
    }



}