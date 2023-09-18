package com.example.act_t1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textView)
        val boton = findViewById<TextView>(R.id.button)
        val fondo = findViewById<TextView>(R.id.contenedor)


        boton.setOnClickListener{
            texto.text="Adios, soy Vanesa"
            fondo.setBackgroundColor(resources.getColor(R.color.black))
        }
    }
}