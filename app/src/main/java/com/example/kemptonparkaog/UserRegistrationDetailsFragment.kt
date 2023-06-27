/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.kemptonparkaog.databinding.UserRegistrationDetailsFragmentBinding

class UserRegistrationDetailsFragment : Fragment(R.layout.user_registration_details_fragment) {
    private lateinit var binding: UserRegistrationDetailsFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = UserRegistrationDetailsFragmentBinding.bind(view)

        setupAdapterForGender()
        setupAdapterForMaritalStatus()
        setupOnclickListeners()
    }

    private fun setupAdapterForGender() {
        val genderAdapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.gender,
            R.layout.testing_dropdown
        )
        genderAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        binding.genderSpinner.adapter = genderAdapter
    }

    private fun setupAdapterForMaritalStatus() {
        val maritalStatusAdapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.marital_status,
            R.layout.testing_dropdown
        )
        maritalStatusAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        binding.maritalStatusSpinner.adapter = maritalStatusAdapter
    }

    private fun setupOnclickListeners() {

    }
}