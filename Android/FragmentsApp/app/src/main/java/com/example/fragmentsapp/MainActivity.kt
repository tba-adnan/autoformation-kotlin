package com.example.fragmentsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val myFragment = Frag()
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.container_view, myFragment)
        transaction.commit()



    }

}