package com.example.swalismarket.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.R
import com.example.swalismarket.databinding.LoginFragmentBinding
import com.example.swalismarket.viewmodelfactories.SignInViewFactory
import com.example.swalismarket.viewmodels.SignInViewModel

class SignInFragment : Fragment() {

    private lateinit var viewModel: SignInViewModel
    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.login_fragment,container,false)
        binding.lifecycleOwner = this
        val viewModelFactory = SignInViewFactory( binding ,this.requireActivity())
        val signInViewModel = ViewModelProvider(this, viewModelFactory)[SignInViewModel::class.java]
        binding.signInViewModel = signInViewModel



        return binding.root
    }


}