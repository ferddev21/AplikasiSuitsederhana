package com.example.aplikasisuitsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_splashscreen.*
import kotlin.random.Random

class Result : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        var pilihan_manusia = intent.getStringExtra("theData")
        val pilihan_computer : String
        var hasil = ""



        //random generator
        var myRandomInt = Random.nextInt(until=2)


        if (myRandomInt == 2){
            pilihan_computer = "Batu"
        }else if(myRandomInt == 1){
            pilihan_computer = "Gunting"
        }else{
            pilihan_computer = "Kertas"
        }





        if (pilihan_computer == pilihan_manusia){

            hasil = "SERI"
            hasil_result.setTextColor(resources.getColorStateList(R.color.colorSuccess))
        }else if(pilihan_manusia == "Batu"){
            if(pilihan_computer == "Gunting"){
                hasil = "KAMU KALAH!"
            } else {
                hasil = "KAMU MENANG!"
                hasil_result.setTextColor(resources.getColorStateList(R.color.colorSuccess))
            }

        }else if(pilihan_manusia == "Gunting"){
            if(pilihan_computer == "Batu"){
                hasil = "KAMU KALAH!"
            } else {
                hasil = "KAMU MENANG!"
                hasil_result.setTextColor(resources.getColorStateList(R.color.colorSuccess))
            }
        }else if(pilihan_manusia == "Kertas"){
            if(pilihan_computer == "Gunting"){
                hasil = "KAMU KALAH!"
            } else {
                hasil = "KAMU MENANG!"
                hasil_result.setTextColor(resources.getColorStateList(R.color.colorSuccess))
            }
        }
            hasil_result.text = hasil.toString()
            comp_result.text = pilihan_computer.toString()

        btn_reboot.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}