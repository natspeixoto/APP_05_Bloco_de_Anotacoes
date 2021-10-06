package com.example.app_05_bloco_de_anotacoes

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private var preferencias: AnotacaoPreferencias? = null
    private var editAnotacao: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editAnotacao = findViewById<EditText>(R.id.txtBlocoAnotacao)
        val preferencias = AnotacaoPreferencias(applicationContext)
        val fab = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener { view -> // sempre dá erro aqui. Professor
            //me auxiliou.Tive que digitar o "view ->" pois foi a forma
            //que eu digo que tera retorno da view
            val textoRecuperado = editAnotacao.getText().toString()
            if(textoRecuperado == ""){
                Snackbar.make(view, "Digite uma anotação para ser salva",
                    Snackbar.LENGTH_LONG)
                    .show()
            } else{
                preferencias!!.salvarAnotacao(textoRecuperado)
                Snackbar.make(view, "Anotação salva com sucesso",
                    Snackbar.LENGTH_LONG)
                    .show()
            }
            }

        }
    }



