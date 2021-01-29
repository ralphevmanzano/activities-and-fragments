package com.example.activities

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class AnotherFragment: Fragment(R.layout.fragment_another) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvMessage = view.findViewById<TextView>(R.id.tv_message)

        val message = arguments?.getString(ExampleFragment.EXTRA_MESSAGE)
        tvMessage.text = message
    }
}