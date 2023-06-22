/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
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
            val clickableSpan: ClickableSpan = object : ClickableSpan() {
                override fun onClick(textView: View) {
                    findNavController().navigate(R.id.action_welcomeFragment_to_userRegistrationFragment)
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)
                    ds.color = binding.connectTextView.context.resources.getColor(R.color.orange);
                    ds.isUnderlineText = false
                }
            }

            setSpan(
                StyleSpan(Typeface.BOLD),
                indexOfConnectMessageString,
                getString(R.string.connect_message).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            setSpan(
                clickableSpan,
                indexOfConnectMessageString,
                getString(R.string.connect_message).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        binding.connectTextView.movementMethod = LinkMovementMethod.getInstance()
        binding.connectTextView.text = spannable
    }

    private fun setOnclickListeners() {
        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
    }
}