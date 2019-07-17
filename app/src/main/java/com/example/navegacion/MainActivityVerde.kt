package com.example.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main_verde.*

class MainActivityVerde : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_verde)
        var nom : String
        val intent = intent
        nom = intent.getStringExtra("nombre")
        Log.d("Asher", nom)
        tvNom.setText(nom)
    }
}
