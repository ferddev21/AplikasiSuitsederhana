package com.example.aplikasisuitsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_splashscreen.*

class Splashscreen : AppCompatActivity() {

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)



        mulai.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }


    }

}