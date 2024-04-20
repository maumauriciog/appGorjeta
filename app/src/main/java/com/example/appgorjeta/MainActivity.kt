package com.example.appgorjeta

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjeta.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var oct: ActivityMainBinding

    @SuppressLint("SetTextI18n")
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

        oct.rbVinteCinco.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                pcr = 25
            }
        }

        //click on the button btnDone
        oct.btnDone.setOnClickListener {
            if (oct.edtValor.text.toString().isNotEmpty() && oct.edtPeople.text.toString()
                    .isNotEmpty()
            ) {
                val tValor: Float = oct.edtValor.text.toString().toFloat()
                val qPessoa: Int = oct.edtPeople.text.toString().toInt()

                val gorjeta: Float = (tValor * pcr) / 100
                val tPpessoa: Float = gorjeta / qPessoa
                val pctPpessoa: Int = pcr / qPessoa
                val totPayRestaurant: Float = tValor + gorjeta
                val totPayRestaurantPpessoa: Float = totPayRestaurant / qPessoa

                oct.txtTotal.text = "R$ $gorjeta"
                oct.txtPpessoa.text = "por pessoa, R$ $tPpessoa ou $pctPpessoa%"
                oct.txtTotPayRest.text = "R$ $totPayRestaurant"
                oct.txtTotPayPpessoa.text = "por pessoa, R$ $totPayRestaurantPpessoa"

                val intent = Intent(this, SummaryActivity::class.java)
                intent.apply {
                    putExtra("block", gorjeta)
                }
            } else {
                Toast.makeText(this, "necessário preencher os campos", Toast.LENGTH_LONG).show()
            }
        }

        //click on the btnClean
        oct.btnClean.setOnClickListener {
            oct.edtValor.setText("")
            oct.edtPeople.setText("")

            oct.txtTotal.text = "R$"
            oct.txtPpessoa.text = "por pessoa, R$"
            oct.txtTotPayRest.text = "R$"
            oct.txtTotPayPpessoa.text = "R$"

            oct.rbDez.isChecked = false
            oct.rbQuinze.isChecked = false
            oct.rbVinte.isChecked = false
            oct.rbVinteCinco.isChecked = false
        }
    }
}