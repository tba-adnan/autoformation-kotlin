package com.example.inappnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.inappnavigation.R.layout.fragment

class Fragment {

    fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(fragment, container, false)

    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access the TextView in the fragment's layout
        val textView = view.findViewById<TextView>(R.id.eltext)

        // Set the text of the TextView
        textView.text = "Hello from my fragment!"
    }


}