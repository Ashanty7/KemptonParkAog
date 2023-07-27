package com.example.kemptonparkaog.view

import android.content.Context
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes layout: Int) : Fragment(layout) {
    lateinit var welcomeActivity: WelcomeActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        welcomeActivity = activity as WelcomeActivity
    }
}