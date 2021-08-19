package br.com.diego.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.diego.calculadoradenotas.databinding.ActivityMainBinding
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCalcular.setOnClickListener {

            /* *
            * Código Base:
            val num1 =  binding.edtNota1
            val num2 =  binding.edtNota2
            val num3 =  binding.edtNota3
            val num4 =  binding.edtNota4
            val faltas = binding.edtFaltas
            val resultado = binding.txtResultado

            val nota1 =  Integer.parseInt(num1.text.toString())
            val nota2 =  Integer.parseInt(num2.text.toString())
            val nota3 =  Integer.parseInt(num3.text.toString())
            val nota4 =  Integer.parseInt(num4.text.toString())
            val numeroFaltas = Integer.parseInt(faltas.text.toString())
            *
            * */

            //Refatoração do código
            val nota1 =  parseInt(binding.edtNota1.text.toString())
            val nota2 =  parseInt(binding.edtNota2.text.toString())
            val nota3 =  parseInt(binding.edtNota3.text.toString())
            val nota4 =  parseInt(binding.edtNota4.text.toString())
            val numeroFaltas = parseInt(binding.edtFaltas.text.toString())
            val resultado = binding.txtResultado

            val media = (nota1 + nota2 + nota3 + nota4) / 4

            if(media >= 5 && numeroFaltas <= 20){
                resultado.setText("Aluno foi aprovado \n Media final: $media")
                resultado.setTextColor(getColor(R.color.green))
            } else if(numeroFaltas > 20) {
                resultado.setText("Aluno foi reprovado por Faltas \n Média Final: $media")
                resultado.setTextColor(getColor(R.color.red))
            } else if(media < 5) {
                resultado.setText("Aluno foi reprovado por Nota \n Média Final: $media")
                resultado.setTextColor(getColor(R.color.red))
            }
        }

        binding.imgbtnSair.setOnClickListener{
            finish()
        }


    }
}