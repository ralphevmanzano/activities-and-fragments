package com.example.activities

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ExampleFragment : Fragment(R.layout.fragment_example) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnSend = view.findViewById<Button>(R.id.btn_send)
        val etMessage = view.findViewById<EditText>(R.id.et_message)

        btnSend.setOnClickListener {
            val bundle = bundleOf(EXTRA_MESSAGE to etMessage.text.toString())
            findNavController().navigate(R.id.action_exampleFragment_to_anotherFragment, bundle)
        }
    }

    companion object {
        const val EXTRA_MESSAGE = "EXTRA_MESSAGE"
    }
}