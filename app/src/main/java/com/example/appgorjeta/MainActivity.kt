package com.example.appgorjeta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjeta.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var oct: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(oct.root)

        //click button btnDone
        var percente: Int = 0
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

        oct.btnDone.setOnClickListener {

            println("A gorjeta será de " + 1 + 1)
        }
    }
}