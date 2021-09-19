package com.solutionsmax.movienews.security

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.solutionsmax.movienews.R
import com.solutionsmax.movienews.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding = DataBindingUtil.bind(view)!!

        binding.btnLogin.setOnClickListener {
            if (binding.txtUsername.text!!.isEmpty() && binding.txtPassword.text!!.isEmpty()) {
                binding.txtUsername.error = getString(R.string.username_cannot_be_empty)
                binding.txtPassword.error = getString(R.string.password_cannot_be_empty)
            } else {
                navController.navigate(R.id.moviesFragment)
            }
        }
    }

}