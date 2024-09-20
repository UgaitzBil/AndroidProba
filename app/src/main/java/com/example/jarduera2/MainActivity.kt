package com.example.jarduera2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var botoia: Button
    lateinit var testua : TextView
    lateinit var num1: EditText
    lateinit var num2 : EditText
    lateinit var bider : CheckBox
    lateinit var zati : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        botoia = findViewById(R.id.btnCal)
        testua = findViewById(R.id.Erantzuna)
        num1 = findViewById(R.id.Number1)
        num2 = findViewById(R.id.Number2)
        bider = findViewById(R.id.checkBider)
        zati = findViewById(R.id.checkZati)


       bider.setOnClickListener(View.OnClickListener{
           if (bider.isChecked) {
               zati.isChecked=false
           }
       })
        zati.setOnClickListener(View.OnClickListener{
            if (zati.isChecked) {
                bider.isChecked=false
            }
        })


        botoia.setOnClickListener {

            val numero1 = num1.getText().toString().toDouble()
            val numero2 = num2.getText().toString().toDouble()
            if (bider.isChecked) {
                val result = numero1 * numero2
                testua.setText(result.toString())
                Log.d("Oharra", "bider sakatu da")
            } else if (zati.isChecked) {
                val result = numero1 / numero2
                testua.setText(result.toString())
                Log.d("Oharra", "zati sakatu da")
            }else if(num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()){
                testua.setText("Zenbakirenbat utzik dago")
            }
        }

    }
    }
