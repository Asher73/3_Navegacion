package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_rojo.*

class MainActivity : AppCompatActivity() {
    var nom: String = ""
    var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun actVerde(v: View){
        nom = etNombre.text.toString()
        val intent = Intent(this, MainActivityVerde::class.java)
        intent.putExtra("nombre", nom)
        startActivity(intent)
    }

    fun actRojo(v : View){
        if(etEdad.text.isEmpty()){
            val intent = Intent(this,MainActivityRojo::class.java)
            startActivity(intent)

        }
        else{
            edad = etEdad.text.toString().toInt()
            val intent = Intent(this, MainActivityRojo::class.java)
            intent.putExtra(MainActivityRojo.EXTRA_EDAD, edad)
            startActivity(intent)
        }
    }
}
