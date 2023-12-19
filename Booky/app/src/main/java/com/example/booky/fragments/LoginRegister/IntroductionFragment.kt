package com.example.booky.fragments.LoginRegister

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.booky.R
import com.example.booky.databinding.FragmentIntroductionBinding
import com.example.booky.databinding.FragmentLoginBinding

class IntroductionFragment:Fragment(R.layout.fragment_introduction) {
    private lateinit var binding: FragmentIntroductionBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntroductionBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.welcomRegisterbutton.setOnClickListener{
            findNavController().navigate(R.id.action_introductionFragment2_to_registerFragment22)

        }
        binding.welcomLoginbutton.setOnClickListener{
            findNavController().navigate(R.id.action_introductionFragment2_to_loginFragment2)
        }

    }
}