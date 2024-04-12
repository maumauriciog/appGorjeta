package com.example.appgorjeta

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValor: EditText = findViewById(R.id.edtValor)
        val edtPeople = findViewById<EditText>(R.id.edtPeople)
        val btnClear: Button = findViewById(R.id.btnClean)
        val btnDone: Button = findViewById(R.id.btnDone)

        btnClear.setOnClickListener{

        }

        btnDone.setOnClickListener{

        }
    }
}