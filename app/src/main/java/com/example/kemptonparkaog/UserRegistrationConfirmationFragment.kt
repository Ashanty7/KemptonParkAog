/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kemptonparkaog.databinding.UserRegistrationConfirmationFragmentBinding

class UserRegistrationConfirmationFragment :
    Fragment(R.layout.user_registration_confirmation_fragment) {
    private lateinit var binding: UserRegistrationConfirmationFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolBar()
    }

    private fun setupToolBar() {
        val welcomeActivity = activity as WelcomeActivity
        welcomeActivity.showToolbar()
        welcomeActivity.setToolbarTitle("Confirmation Information")
    }
}