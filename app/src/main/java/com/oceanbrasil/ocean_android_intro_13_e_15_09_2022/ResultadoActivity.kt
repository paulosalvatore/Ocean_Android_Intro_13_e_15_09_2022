package com.oceanbrasil.ocean_android_intro_13_e_15_09_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Pegamos o elemento Button (btVoltar) na tela, pelo ID
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        // Adicionamos um listener para o btVoltar
        btVoltar.setOnClickListener {
            // Finalizamos a tela, pois a MainActivity está por baixo
            finish()
        }
    }
}