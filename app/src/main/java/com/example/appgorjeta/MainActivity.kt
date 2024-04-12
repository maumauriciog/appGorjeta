package com.example.appgorjeta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjeta.databinding.ActivityMainBinding


class MainActivity: AppCompatActivity(){
    private lateinit var oct: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(oct.root)

    }

}