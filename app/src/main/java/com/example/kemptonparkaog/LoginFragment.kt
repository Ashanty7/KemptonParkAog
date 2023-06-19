/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kemptonparkaog.databinding.LoginFragmentBinding

class LoginFragment : Fragment(R.layout.login_fragment) {
    private lateinit var binding: LoginFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = LoginFragmentBinding.bind(view)

        makeTextClickableAndChangeTextColor()
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