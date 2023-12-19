package com.example.booky.fragments.categories

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.booky.R
import com.example.booky.databinding.FragmentBaseCategoryBinding
import com.example.booky.databinding.FragmentMainCategoryBinding

open class BaseCategoryFragment:Fragment(R.layout.fragment_base_category) {
    private lateinit var binding: FragmentBaseCategoryBinding
    val color = Color.RED



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentBaseCategoryBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addtocart1.setOnClickListener{

            Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()





        }
        binding.addtocart2.setOnClickListener{

            Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()



        }
        binding.addtocart3.setOnClickListener{

            Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()


        }
        binding.addtocart4.setOnClickListener{

            Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()


        }
        binding.addtocart5.setOnClickListener{

            Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()


        }
        binding.imgFavorite.setOnClickListener{
            binding.imgFavorite.setBackgroundColor(color)
        }
        binding.imgFavorite1.setOnClickListener{
            binding.imgFavorite.setBackgroundColor(color)
        }
        binding.imgFavorite2.setOnClickListener{
            binding.imgFavorite.setBackgroundColor(color)
        }



    }
}