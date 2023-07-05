/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog.View

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.kemptonparkaog.R
import com.example.kemptonparkaog.databinding.UserRegistrationDetailsFragmentBinding

class UserRegistrationDetailsFragment : BaseFragment(R.layout.user_registration_details_fragment) {
    private lateinit var binding: UserRegistrationDetailsFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = UserRegistrationDetailsFragmentBinding.bind(view)

        welcomeActivity.showToolBar()
        welcomeActivity.setToolBarTitle("Personal Information")

        setupAdapterForGender()
        setupAdapterForMaritalStatus()
        setupOnclickListeners()
    }

    private fun setupAdapterForGender() {
        val feelings = resources.getStringArray(R.array.gender)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.testing_dropdown, feelings)
        binding.genderAutoCompleteTextView.setAdapter(arrayAdapter)
    }

    private fun setupAdapterForMaritalStatus() {
        val feelings = resources.getStringArray(R.array.marital_status)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.testing_dropdown, feelings)
        binding.maritalStatusAutoCompleteTextView.setAdapter(arrayAdapter)
    }

    private fun setupOnclickListeners() {
        binding.continueButton.setOnClickListener {
            findNavController().navigate(R.id.action_userRegistrationDetailsFragment_to_userRegistrationConfirmationFragment)
        }
    }
}