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

        var pcr: Int = 0
        oct.rbDez.setOnCheckedChangeListener { _, isCheckedA ->
            if (isCheckedA) {
                pcr = 10
            }
        }
        oct.rbQuinze.setOnCheckedChangeListener { _, isCheckedB ->
            if (isCheckedB) {
                pcr = 15
            }
        }
        oct.rdVinte.setOnCheckedChangeListener { _, isCheckedC ->
            if (isCheckedC) {
                pcr = 20
            }
        }
        //click on the button btnDone
        oct.btnDone.setOnClickListener {
            if (oct.edtValor.text.toString().isNotEmpty() && oct.edtPeople.text.toString().isNotEmpty()){
                val tValor: Float = oct.edtValor.text.toString().toFloat()
                val tPessoa: Int = oct.edtPeople.text.toString().toInt()
                val gorjeta: Float = (tValor * pcr) / 100

                println("A gorjeta será de $gorjeta")
            } else{
                Toast.makeText(this, "Precisa preencher todos os Campos", Toast.LENGTH_LONG).show()
            }
        }
    }
}