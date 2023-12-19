package com.example.booky.fragments.Shopping

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.booky.R
import com.example.booky.databinding.FragmentCartBinding
import com.example.booky.databinding.FragmentMainCategoryBinding

class CartFragment: Fragment(R.layout.fragment_cart) {
    private lateinit var binding: FragmentCartBinding
    val color = Color.GREEN


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     binding.buttonCheckout.setOnClickListener{
         binding.buttonCheckout.setBackgroundColor(color)
         binding.buttonCheckout.setText("DONE")
     }
    }
}