package com.example.appgorjeta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjeta.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var oct: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var percente: Int = 0

        //click button btnDone
        oct.btnDone.setOnClickListener {
            oct.rbDez.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    percente = 10
                }
            }
            oct.rbQuinze.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked){
                    percente = 15
                }
            }
            oct.rdVinte.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked){
                    percente = 20
                }
            }

            val valor

        }
    }
}