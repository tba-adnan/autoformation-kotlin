package com.example.testdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(this,"it works!", Toast.LENGTH_SHORT)
 toast.show()

    }

     fun demo() {
        val demo: String = "this is a demo".also(::println)
    }
}