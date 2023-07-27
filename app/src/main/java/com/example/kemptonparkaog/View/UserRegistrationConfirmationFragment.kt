/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog.View

import android.os.Bundle
import android.view.View
import com.example.kemptonparkaog.R
import com.example.kemptonparkaog.databinding.UserRegistrationConfirmationFragmentBinding

class UserRegistrationConfirmationFragment :
    BaseFragment(R.layout.user_registration_confirmation_fragment) {
    private lateinit var binding: UserRegistrationConfirmationFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = UserRegistrationConfirmationFragmentBinding.bind(view)
        welcomeActivity.showToolBar()
        welcomeActivity.setToolBarTitle("Confirmation Information")

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.continueButton.setOnClickListener {
            CustomDialogFragment().show(childFragmentManager, CustomDialogFragment.TAG)
        }
    }
}