package com.example.swalismarket.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.R
import com.example.swalismarket.databinding.SignUpFragmentBinding
import com.example.swalismarket.viewmodelfactories.SignUpViewFactory
import com.example.swalismarket.viewmodels.SignUpViewModel

class SignUpFragment : Fragment() {


    private lateinit var binding: SignUpFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater,R.layout.sign_up_fragment,container,false)
        binding.lifecycleOwner = this
        val viewModelFactory = SignUpViewFactory( binding ,this.requireActivity())
        val signUpViewModel = ViewModelProvider(this, viewModelFactory)[SignUpViewModel::class.java]
        binding.signUpViewModel = signUpViewModel



        return binding.root
    }



}