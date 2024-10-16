package com.hits.moviecatalog.ui.welcomescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hits.moviecatalog.databinding.FragmentWelcomeBinding
import com.hits.moviecatalog.ui.signin.SigninFragment
import com.hits.moviecatalog.ui.signin.SigninViewModel
import com.hits.moviecatalog.ui.signup.SignupFragment

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val welcomeViewModel =
            ViewModelProvider(this)[SigninViewModel::class.java]

        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val signinFragment = SigninFragment()
        val signupFragment = SignupFragment()

        _binding!!.signIn.setOnClickListener() {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(this.id, signinFragment)
                ?.commitAllowingStateLoss()
        }

        _binding!!.signUp.setOnClickListener() {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(this.id, signupFragment)
                ?.commitAllowingStateLoss()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}