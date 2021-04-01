package com.example.calcularnotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCalcular: Button = btn_calcular
        val resultado: TextView = txt_resultado

        botaoCalcular.setOnClickListener{

            val nota1: Int = Integer.parseInt(edt_nota1.text.toString())
            val nota2: Int = Integer.parseInt(edt_nota2.text.toString())
            val media: Int = (nota1+nota2)/2
            val faltas: Int = Integer.parseInt(edt_faltas.text.toString())

            if(media>=7 && faltas<=10){
                resultado.setText("O aluno foi aprovado!! \n Média: $media \n  Número de Faltas: $faltas \n ")
                resultado.setTextColor(Color.WHITE)
            }else{
                resultado.setText("O aluno foi reprovado!! \n Média: $media \n  Número de Faltas: $faltas \n ")
                resultado.setTextColor(Color.YELLOW)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this,
        "Obrigada por usar o nosso app!! \n Volte sempre!!",
        Toast.LENGTH_SHORT).show()
    }

}