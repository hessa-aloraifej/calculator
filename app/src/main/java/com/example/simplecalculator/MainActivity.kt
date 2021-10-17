package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val number1 = findViewById<EditText>(R.id.editText)
        val number2 = findViewById<EditText>(R.id.editText2)
        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var result =findViewById<TextView>(R.id.textView4)
        button.setOnClickListener{result.text=add(number1.text.toString().toInt(),number2.text.toString().toInt()).toString().trim()}
        button2.setOnClickListener{result.text=sub(number1.text.toString().toInt(),number2.text.toString().toInt()).toString().trim()}
        button3.setOnClickListener{result.text=div(number1.text.toString().toFloat(),number2.text.toString().toFloat()).toString().trim()}
        button4.setOnClickListener{result.text=mul(number1.text.toString().toInt(),number2.text.toString().toInt()).toString().trim()}
    }
    fun add(number1:Int,number2: Int):Float{return (number1 + number2).toFloat()}
    fun sub(number1:Int,number2: Int):Float{return (number1 - number2).toFloat()}
    fun mul(number1:Int,number2: Int):Float{return (number1 * number2).toFloat()}
    fun div(number1:Float,number2: Float):String{
        if(number2 ==0f){

            return ("Sorry, Its Infinity.Because The Number 2 Is=0")
        }
        else {
            return (number1/number2).toString() }
    }
}