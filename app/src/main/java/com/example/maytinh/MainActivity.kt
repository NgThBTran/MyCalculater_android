package com.example.maytinh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts


class MainActivity : AppCompatActivity() {
    var input1 = ""
    var input2 = ""
    var method = ""
    var ListResult: ArrayList<String> = arrayListOf()

    private lateinit var textViewinput: TextView
     var resultLauncherLambda = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
         // There are no request codes
         val data: Intent? = result.data
         Log.e("MainActivity", "Second activity callback: " + data?.getStringExtra("second_key_1"))

     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewinput = findViewById<TextView>(R.id.input)
        textViewinput.setText("")
        setupUI()
    }
    fun setupUI(){
        textViewinput = findViewById(R.id.input)
        val num=findViewById<ImageButton>(R.id.imageButton2)
        num.setOnClickListener() {
            goToSecondActivity()
        }
        val number1 = findViewById<Button>(R.id.number1)
        number1.setOnClickListener {
            if(method=="")
            {
                input1 = input1 + "1"
            }
            else
            {
                input2 = input2 + "1"
            }
            var oldValue = textViewinput.text.toString()
            var newValue = oldValue + "1"
            textViewinput.setText(newValue)
        }
        val number2 = findViewById<Button>(R.id.number2)
        number2.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "2"
            }
            else
            {
                input2 = input2 + "2"
            }
            var oldValue = textViewinput.text.toString()
            var newValue = oldValue + "2"
            textViewinput.setText(newValue)
        }
        val number3 = findViewById<Button>(R.id.number3)
        number3.setOnClickListener {
            if (method == "")
            {
                input1 = input1 +"3"
            }
            else
            {
                input2 = input2 +"3"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "3"
            textViewinput.setText(newValue)
        }
        val number4 = findViewById<Button>(R.id.number4)
        number4.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "4"
            }
            else
            {
                input2 = input2 + "4"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "4"
            textViewinput.setText(newValue)
        }
        val number5 = findViewById<Button>(R.id.number5)
        number5.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "5"
            }
            else
            {
                input2 = input2 +"5"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "5"
            textViewinput.setText(newValue)
        }
        val number6 = findViewById<Button>(R.id.number6)
        number6.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "6"
            }
            else
            {
                input2 = input2 + "6"
            }
            var olValue= textViewinput.text.toString()
            var newValue = olValue + "6"
            textViewinput.setText(newValue)
        }
        val number7 = findViewById<Button>(R.id.number7)
        number7.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "7"
            }
            else
            {
                input2 = input2 +"7"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "7"
            textViewinput.setText(newValue)
        }
        val number8 = findViewById<Button>(R.id.number8)
        number8.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "8"
            }
            else
            {
                input2 + input2 + "8"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "8"
            textViewinput.setText(newValue)
        }
        val number9 = findViewById<Button>(R.id.number9)
        number9.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "9"
            }
            else
            {
                input2 = input2 + "9"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "9"
            textViewinput.setText(newValue)
        }
        val number0 = findViewById<Button>(R.id.number0)
        number0.setOnClickListener {
            if (method == "")
            {
                input1 = input1 + "0"
            }
            else
            {
                input2 = input2 + "0"
            }
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "0"
            textViewinput.setText(newValue)
        }
        val div = findViewById<Button>(R.id.buttonDIV)
        div.setOnClickListener {
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "÷"
            textViewinput.setText(newValue)
            method = "÷"
        }
        val mul = findViewById<Button>(R.id.buttonMUL)
        mul.setOnClickListener {
            var olValue = textViewinput.text.toString()
            var newValue = olValue + "x"
            textViewinput.setText(newValue)
            method = "x"
        }
        val sub = findViewById<Button>(R.id.buttonSUB)
        sub.setOnClickListener {
            var olValue = textViewinput.text.toString()
            var newValue = olValue + " - "
            textViewinput.setText(newValue)
            method = "-"
        }
        val add = findViewById<Button>(R.id.buttonADD)
        add.setOnClickListener {
            var oldValue = textViewinput.text.toString()
            var newValue = oldValue + " + "
            textViewinput.setText(newValue)
            method = "+"
        }
        val ac = findViewById<Button>(R.id.buttonAC)
        ac.setOnClickListener {
            textViewinput.setText("")
            input1 = ""
            input2 = ""
            method = ""
        }
        val result = findViewById<Button>(R.id.buttonResult)
        result.setOnClickListener {
            var result = 0.0
            if (method == "+")
            {
                result = input1.toDouble() + input2.toDouble()
            }
            else if (method == "-"){
                result = input1.toDouble() - input2.toDouble()
            }
            else if ( method == "x"){
                result = input1.toDouble() * input2.toDouble()
            }
            else if (method == "÷"  ){
                result = input1.toDouble() / input2.toDouble()
            }
            var value = textViewinput.text.toString() + " = " + result.toString()
            textViewinput.setText(result.toString())
            ListResult.add(value)
        }
    }

    private fun goToSecondActivity() {
        val intent=Intent(this,HistoryRecycleActivity::class.java)
        intent.putExtra("key_result",ListResult.toTypedArray())
        //startActivity(intent) // not return data
        //resultLauncherNormal.launcher(intent) // return data
        resultLauncherLambda.launch(intent) // return data
    }
}