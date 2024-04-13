package com.example.appgorjeta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjeta.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var oct: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(oct.root)

        var pcr = 0
        oct.rbDez.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                pcr = 10
            }
        }
        oct.rbQuinze.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                pcr = 15
            }
        }
        oct.rbVinte.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                pcr = 20
            }
        }
        //click on the button btnDone
        oct.btnDone.setOnClickListener {
            if (oct.edtValor.text.toString().isNotEmpty() && oct.edtPeople.text.toString()
                    .isNotEmpty()
            ) {
                val tValor: Float = oct.edtValor.text.toString().toFloat()
                val tPessoa: Int = oct.edtPeople.text.toString().toInt()
                val gorjeta: Float = (tValor * pcr) / 100
                val tPay: Float = gorjeta + tValor




                println("Minha conta deu: $tValor")
                println("Total Pessoa: $tPessoa")
                println("Gorjeta: $gorjeta")
                println("Total Pagar: $tPay")
            } else {
                Toast.makeText(this, "necessário preencher os campos", Toast.LENGTH_LONG).show()
            }
        }

        //click on the btnClean
        oct.btnClean.setOnClickListener {
            oct.edtValor.setText("")
            oct.rbDez.isChecked = false
        }
    }
}