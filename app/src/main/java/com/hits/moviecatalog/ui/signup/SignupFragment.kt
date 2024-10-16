package com.hits.moviecatalog.ui.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hits.moviecatalog.databinding.FragmentSigninBinding
import com.hits.moviecatalog.databinding.FragmentSignupBinding
import com.hits.moviecatalog.ui.signin.SigninViewModel
import com.hits.moviecatalog.ui.welcomescreen.WelcomeFragment

class SignupFragment : Fragment() {
    private var _binding: FragmentSignupBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val signupViewModel =
            ViewModelProvider(this)[SignupViewModel::class.java]

        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val welcomeFragment = WelcomeFragment()

        _binding!!.back.setOnClickListener() {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(this.id, welcomeFragment)
                ?.commitAllowingStateLoss()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}