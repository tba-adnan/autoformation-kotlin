package com.example.inappnavigation

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        // Create a new instance of your fragment
        val myFragment = Fragment()

        // Start a new FragmentTransaction
        val transaction = fragmentManager.beginTransaction()

        // Add the fragment to a container view in your activity's layout
        transaction.add(R.id.my_container_view, Fragment)

        // Commit the transaction
        transaction.commit()

    }






}