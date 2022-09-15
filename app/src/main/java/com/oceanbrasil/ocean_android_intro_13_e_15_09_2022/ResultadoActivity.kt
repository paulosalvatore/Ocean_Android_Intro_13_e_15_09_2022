package com.oceanbrasil.ocean_android_intro_13_e_15_09_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Pegamos o nomeDigitado que foi passado pela outra tela via Intent
        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        // Pegamos o tvResultado e atualizamos o texto dele com o nomeDigitado
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = nomeDigitado

        // Pegamos o elemento Button (btVoltar) na tela, pelo ID
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        // Adicionamos um listener para o btVoltar
        btVoltar.setOnClickListener {
            // Finalizamos a tela, pois a MainActivity está por baixo
            finish()
        }
    }
}