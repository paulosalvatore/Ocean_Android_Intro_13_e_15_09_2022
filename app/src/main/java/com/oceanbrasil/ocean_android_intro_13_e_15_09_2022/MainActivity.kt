package com.oceanbrasil.ocean_android_intro_13_e_15_09_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Detectar o clique no botão

        // Pegamos o elemento Button na tela, pelo ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)

        // Pegamos o elemento TextView na tela, pelo ID
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Pegamos o elemento EditText na tela, pelo ID
        val etNome = findViewById<EditText>(R.id.etNome)

        // Adicionamos um listener para o btEnviar
        btEnviar.setOnClickListener {
            // Tudo que escrevermos dentro deste bloco será executado
            // assim que o Button for clicado

            val nome = etNome.text

            if (nome.isNotBlank()) {
                // Alterar o texto do TextView
                tvResultado.text = nome
            } else {
                etNome.error = "Digite um nome válido!"
            }
        }
    }
}