package com.example.booky.fragments.LoginRegister

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.booky.R
import com.example.booky.data.User
import com.example.booky.databinding.FragmentRegisterBinding
import com.example.booky.util.Resource
import com.example.booky.viewmodel.RegisterViewModel
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
private val TAG="RegisterFragment"
@AndroidEntryPoint
class RegisterFragment:Fragment() {
    private lateinit var binding:FragmentRegisterBinding
    private val viewModel by viewModels<RegisterViewModel> ()






    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.HaveAnAcc.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment2_to_loginFragment2)
        }
        binding.apply {
            buttonRegister.setOnClickListener{
                val user=User(
                    edFirstNameRegister.text.toString(),
                    edSecondNameRegister.text.toString(),
                    edEmailRegister.text.toString(),

                )
                val password = edPassRegister.text.toString()
                viewModel.createAccountWithEmailAndPassword(user,password)
            }
        }
        lifecycleScope.launchWhenStarted {
            viewModel.register.collect { resource ->
                when (resource) {
                    is Resource.Loading -> {
                        binding.buttonRegister.startAnimation()
                    }
                    is Resource.Success -> {
                        Log.d("test", resource.data.toString())
                        binding.buttonRegister.revertAnimation()
                        Toast.makeText(requireContext(),"the email created Successfully", Toast.LENGTH_SHORT).show()
                    }
                    is Resource.Error -> {
                        Log.e(TAG, resource.message.toString())
                        // Display the error message to the user
                        Toast.makeText(requireContext(), "Registration failed: ${resource.message}", Toast.LENGTH_SHORT).show()
                        binding.buttonRegister.revertAnimation()
                    }
                    else -> Unit
                }
            }
        }

        }
    }
