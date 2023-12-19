package com.example.booky.fragments.Shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.booky.R
import com.example.booky.adapters.HomeViewPagerAdapter
import com.example.booky.databinding.FragmentHomeBinding
import com.example.booky.fragments.categories.*
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val categoriesFragments = arrayListOf<Fragment>(
            MainCategoryFragment(),
            DramaFragment(),
            FantasyFragment(),
            HorrorFragment(),
            ScienceFictionFragment(),
            AdventureFragment(),




        )
        val viewPager2Adapter=HomeViewPagerAdapter(categoriesFragments,childFragmentManager,lifecycle)
        binding.viewpagerHome.adapter=viewPager2Adapter
        TabLayoutMediator(binding.tabLayout,binding.viewpagerHome){
            tab,position->
            when(position){
                0->tab.text="Main"
                1->tab.text="Drama"
                2->tab.text="Fantasy"
                3->tab.text="Horror"
                4->tab.text="ScienceFiction"
                5->tab.text="Advanture"
            }
        }.attach()
    }
}