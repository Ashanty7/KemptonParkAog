/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog.View

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.kemptonparkaog.R
import com.example.kemptonparkaog.databinding.LoginFragmentBinding

class LoginFragment : BaseFragment(R.layout.login_fragment) {
    private lateinit var binding: LoginFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = LoginFragmentBinding.bind(view)

        welcomeActivity.hideToolBar()
        makeTextClickableAndChangeTextColor()
        setOnclickListeners()
    }

    private fun setOnclickListeners() {
        binding.loginLayout.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }
    }

    private fun makeTextClickableAndChangeTextColor() {
        val forgotPasswordMessage =
            getString(R.string.forgot_password).indexOf(getString(R.string.forgot_password))

        val spannable = SpannableString(getString(R.string.forgot_password)).apply {
            setSpan(
                ForegroundColorSpan(resources.getColor(R.color.orange)),
                forgotPasswordMessage,
                getString(R.string.forgot_password).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            setSpan(
                StyleSpan(Typeface.BOLD),
                forgotPasswordMessage,
                getString(R.string.forgot_password).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        binding.loginLayout.forgotPasswordTextView.text = spannable
    }
}