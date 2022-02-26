package com.example.swalismarket.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.swalismarket.R
import com.example.swalismarket.databinding.LogPrincipalFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class LogPrincipalFragment : Fragment() {

    private lateinit var binding: LogPrincipalFragmentBinding
    private lateinit var demoCollectionAdapter: DemoCollectionAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater,R.layout.log_principal_fragment,container,false)
        binding.lifecycleOwner = this

        demoCollectionAdapter = DemoCollectionAdapter(this)
        viewPager = binding.pager
        viewPager.adapter = demoCollectionAdapter

        val tabLayout = binding.tabLayout

        TabLayoutMediator(tabLayout, viewPager) { tab, position -> when(position){
            1 -> tab.text = "Se connecter"
            else -> tab.text = "S'inscrire"
        }

        }.attach()

        return binding.root
    }

}

class DemoCollectionAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        val fragment = when(position){
            1-> SignUpFragment()
            else -> SignInFragment()
        }
        return fragment
    }
}