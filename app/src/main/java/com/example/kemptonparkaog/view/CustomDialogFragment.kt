package com.example.kemptonparkaog.view

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.kemptonparkaog.R
import com.example.kemptonparkaog.databinding.CustomDialogFragmentBinding

class CustomDialogFragment : DialogFragment(R.layout.custom_dialog_fragment) {
    lateinit var binding: CustomDialogFragmentBinding

    companion object {
        const val TAG = "CustomDialogFragment"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.setBackgroundDrawableResource(R.drawable.round_corner);
        binding = CustomDialogFragmentBinding.bind(view)

        binding.okButton.setOnClickListener {
            findNavController().navigate(R.id.action_userRegistrationConfirmationFragment_to_welcomeFragment)
        }
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog?.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}