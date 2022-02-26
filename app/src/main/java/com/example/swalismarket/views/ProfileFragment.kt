package com.example.swalismarket.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.swalismarket.R
import com.example.swalismarket.databinding.ProfileFragmentBinding
import com.example.swalismarket.viewmodelfactories.ClientProfileViewFactory
import com.example.swalismarket.viewmodels.ProfileViewModel

class ProfileFragment : Fragment() {


    private lateinit var binding: ProfileFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.profile_fragment,container,false)
        binding.lifecycleOwner = this
        val viewModelFactory = ClientProfileViewFactory( binding ,this.requireActivity())
        val clientProfileViewModel = ViewModelProvider(this, viewModelFactory)[ProfileViewModel::class.java]




        return inflater.inflate(R.layout.profile_fragment, container, false)
    }



}