package com.example.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_rojo.*

class MainActivityRojo : AppCompatActivity() {

    /*al declarar un companion object dentro de nuestra clase,
    * se podra llamar  a sus miembros con la misma sintaxis que
    * llama a los metodos estaticos en JAVA/C#, usando
    * solo el nobre de la clase como calificador.
    * */

    companion object{
        val EXTRA_EDAD = "extraEdad"
        private  val DEFAULT_EDAD: Int = -1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rojo)

        val intent = intent
        if(intent != null && intent.hasExtra(EXTRA_EDAD)){
            val edad : Int = intent.getIntExtra(EXTRA_EDAD, DEFAULT_EDAD)
            tvEdad.setText(edad.toString())
        }
    }
}
