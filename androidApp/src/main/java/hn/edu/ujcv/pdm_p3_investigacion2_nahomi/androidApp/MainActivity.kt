package hn.edu.ujcv.pdm_p3_investigacion2_nahomi.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import hn.edu.ujcv.pdm_p3_investigacion2_nahomi.shared.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()*/

        var btnCalcular=findViewById<View>(R.id.btnCalcular) as Button
        btnCalcular.setOnClickListener { calcularmultiplicacion()}

    }
    fun calcularmultiplicacion (){
        var numeroUno=findViewById<View>(R.id.numeroUno) as EditText
        var numeroDos=findViewById<View>(R.id.numeroDos) as EditText
        var txtResultado=findViewById<View>(R.id.txtResultado) as TextView

        var resultado=numeroUno.text.toString().toDouble() + numeroDos.text.toString().toDouble()

        txtResultado.text=getString(R.string.resultado,resultado.toString())
    }
}
