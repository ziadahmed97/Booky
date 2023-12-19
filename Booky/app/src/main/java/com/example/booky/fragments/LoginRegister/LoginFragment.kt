package com.example.booky.fragments.LoginRegister

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.booky.R
import com.example.booky.activities.ShoppingActivity
import com.example.booky.databinding.FragmentLoginBinding
import com.example.booky.util.Resource
import com.example.booky.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class LoginFragment:Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.dontHaveAnAcc.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment2_to_registerFragment2)
        }

        binding.apply {
            buttonLoginLogin.setOnClickListener{
                val email = edEmailLogin.text.toString()
                val password = edPasswordLogin.text.toString()
                viewModel.login(email, password)

        }

        }
        lifecycleScope.launchWhenStarted {
            viewModel.login.collect{
                when(it){
                    is Resource.Loading ->{
                        binding.buttonLoginLogin.startAnimation()

                    }
                    is Resource.Success ->{
                        binding.buttonLoginLogin.revertAnimation()
                        Intent(requireActivity(),ShoppingActivity::class.java).also{
                            intent ->  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            startActivity(intent)
                        }


                    }
                    is Resource.Error ->{
                        Toast.makeText(requireContext(),"INVALID email and password",Toast.LENGTH_LONG).show()
                        binding.buttonLoginLogin.revertAnimation()

                    }
                    else ->Unit
                }
            }
        }
    }
}