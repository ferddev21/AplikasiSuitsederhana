package com.example.aplikasisuitsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pilihan_manusia : String


        btn_batu.setOnClickListener {
            pilihan_manusia = "Batu"
            runcoy(pilihan_manusia)
        }
        btn_kertas.setOnClickListener {
            pilihan_manusia = "Kertas"
            runcoy(pilihan_manusia)
        }
        btn_gunting.setOnClickListener {
            pilihan_manusia = "Gunting"
            runcoy(pilihan_manusia)
        }


    }

    private fun runcoy(pilihan_manusia: String){
        val intent = Intent(this, Result::class.java)
        intent.putExtra("theData", pilihan_manusia)
        startActivity(intent)
    }

}