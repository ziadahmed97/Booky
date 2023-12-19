package com.example.booky.fragments.categories

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.toColor
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBindings
import com.example.booky.R
import com.example.booky.adapters.SpecialProductsAdapter
import com.example.booky.databinding.FragmentCartBinding
import com.example.booky.databinding.FragmentHomeBinding
import com.example.booky.databinding.FragmentLoginBinding
import com.example.booky.databinding.FragmentMainCategoryBinding
import com.example.booky.fragments.Shopping.CartFragment
import java.util.zip.Inflater

class MainCategoryFragment: Fragment(R.layout.fragment_main_category) {
    private lateinit var binding: FragmentMainCategoryBinding
    val color = Color.RED



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding= FragmentMainCategoryBinding.inflate(inflater)

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


    }



}