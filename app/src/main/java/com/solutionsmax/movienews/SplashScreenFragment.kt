package com.solutionsmax.movienews

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.solutionsmax.movienews.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {
    private lateinit var binding: FragmentSplashScreenBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding = DataBindingUtil.bind(view)!!
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.loginFragment)
        }, 5000)
    }

}