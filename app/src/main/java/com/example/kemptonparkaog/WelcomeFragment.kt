package com.example.kemptonparkaog

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kemptonparkaog.databinding.WelcomeFragmentBinding

class WelcomeFragment : Fragment(R.layout.welcome_fragment) {
    private lateinit var binding: WelcomeFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = WelcomeFragmentBinding.bind(view)

        makeTextClickableAndChangeTextColor()
        setOnclickListeners()
    }

    private fun makeTextClickableAndChangeTextColor() {
        val indexOfConnectMessageString =
            getString(R.string.connect_message).indexOf(getString(R.string.connect))

        val spannable = SpannableString(getString(R.string.connect_message)).apply {
            setSpan(
                ForegroundColorSpan(resources.getColor(R.color.orange)),
                indexOfConnectMessageString,
                getString(R.string.connect_message).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            setSpan(
                StyleSpan(Typeface.BOLD),
                indexOfConnectMessageString,
                getString(R.string.connect_message).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        binding.connectTextView.text = spannable
    }

    private fun setOnclickListeners() {

        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
    }
}