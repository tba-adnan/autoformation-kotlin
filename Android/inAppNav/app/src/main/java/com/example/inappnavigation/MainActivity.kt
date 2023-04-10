package com.example.inappnavigation

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openExternalapp()
    }

    // Open external app
    fun openExternalapp() {
        fun openExternalApp() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=UnGIis48XYQ"))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                println("Error")
            }
        }


    }

}