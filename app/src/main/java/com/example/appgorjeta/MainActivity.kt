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

        var porcentagem: Int = 0
        oct.rbDez.setOnCheckedChangeListener { _, isCheckedA ->
            if (isCheckedA) {
                porcentagem = 10
            }
        }
        oct.rbQuinze.setOnCheckedChangeListener { _, isCheckedB ->
            if (isCheckedB) {
                porcentagem = 15
            }
        }
        oct.rdVinte.setOnCheckedChangeListener { _, isCheckedC ->
            if (isCheckedC) {
                porcentagem = 20
            }
        }

        //click on the button btnDone
        oct.btnDone.setOnClickListener {
            println("A gorjeta será de " + porcentagem)
        }
    }
}