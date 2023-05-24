package com.example.kemptonparkaog

import android.os.Bundle
import android.os.PersistableBundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.URLSpan
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Typeface
import androidx.core.content.ContextCompat
import com.example.kemptonparkaog.databinding.WelcomeActivityBinding
import kotlinx.android.synthetic.main.welcome_activity.connectTextView

class WelcomeActivity : AppCompatActivity(R.layout.welcome_activity) {
    private lateinit var binding: WelcomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WelcomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val indexOfConnectMessageString =
            getString(R.string.connect_message).indexOf(getString(R.string.connect))

        val spannable = SpannableString(getString(R.string.connect_message)).apply {
            setSpan(
                ForegroundColorSpan(getColor(R.color.orange)),
                indexOfConnectMessageString,
                getString(R.string.connect_message).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            setSpan(
                StyleSpan(android.graphics.Typeface.BOLD),
                indexOfConnectMessageString,
                getString(R.string.connect_message).length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        binding.connectTextView.text = spannable
    }
}