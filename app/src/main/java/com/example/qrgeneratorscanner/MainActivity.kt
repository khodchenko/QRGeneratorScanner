package com.example.qrgeneratorscanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var im: ImageView
    lateinit var bGenerate : Button
    lateinit var bScanner : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bGenerate = findViewById(R.id.bGenerate)
        bScanner = findViewById(R.id.bScan)
        bScanner.setOnClickListener{
            startActivity(Intent(this, ScannerActivity::class.java))
        }
    }
}