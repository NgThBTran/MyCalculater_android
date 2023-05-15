package com.example.maytinh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.CalendarContract.CalendarEntity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.activity.result.contract.ActivityResultContracts
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    var input1 = ""
    var input2 = ""
    var method = ""
    var ListResult: ArrayList<CalculatorResult> = arrayListOf()

    private lateinit var textViewinput: TextView
    private var resultLauncherLambda = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
         // There are no request codes
         val data: Intent? = result.data
         Log.e("MainActivity", "Second activity callback: " + data?.getStringExtra("second_key_1"))
     }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putSerializable("key_result",ListResult)
        outState.putString("input1",input1)
        outState.putString("input2",input2)
        outState.putString("method",method)
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
       var ListReult = savedInstanceState.getSerializable("key_result") as? ArrayList<CalculatorResult> ?: arrayListOf()
        textViewinput.text = ListReult.last().result
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        if (savedInstanceState != null){
            input1 = savedInstanceState.getString("input1").toString()
            input2= savedInstanceState.getString("input2").toString()
            method = savedInstanceState.getString("method").toString()
        }
        textViewinput = findViewById(R.id.input)
        textViewinput.text = ""
        setupUI()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.acion_history -> {
                goToSecondActivity()
            }
            else -> {
            }
        }
        return super.onOptionsItemSelected(item)
    }
    private fun setupUI(){
        var bt = 0
        val number1 = findViewById<Button>(R.id.number1)
        number1.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number2 = findViewById<Button>(R.id.number2)
        number2.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number3 = findViewById<Button>(R.id.number3)
        number3.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number4 = findViewById<Button>(R.id.number4)
        number4.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number5 = findViewById<Button>(R.id.number5)
        number5.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number6 = findViewById<Button>(R.id.number6)
        number6.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number7 = findViewById<Button>(R.id.number7)
        number7.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number8 = findViewById<Button>(R.id.number8)
        number8.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
        }
        val number9 = findViewById<Button>(R.id.number9)
        number9.setOnClickListener {
            if (bt == 1)
            {
                textViewinput.text = ""
                bt = 0
            }
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
            textViewinput.text = newValue
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
            textViewinput.text = newValue
        }
        val div = findViewById<Button>(R.id.buttonDIV)
        div.setOnClickListener {
            var olValue = textViewinput.text.toString()
            var newValue = olValue + " ÷ "
            textViewinput.text = newValue
            method = "÷"
        }
        val mul = findViewById<Button>(R.id.buttonMUL)
        mul.setOnClickListener {
            var olValue = textViewinput.text.toString()
            var newValue = olValue + " × "
            textViewinput.text = newValue
            method = "x"
        }
        val sub = findViewById<Button>(R.id.buttonSUB)
        sub.setOnClickListener {
            var olValue = textViewinput.text.toString()
            var newValue = olValue + " − "
            textViewinput.text = newValue
            method = "-"
        }
        val add = findViewById<Button>(R.id.buttonADD)
        add.setOnClickListener {
            var oldValue = textViewinput.text.toString()
            var newValue = oldValue + " + "
            textViewinput.text = newValue
            method = "+"
        }
        val ac = findViewById<Button>(R.id.buttonAC)
        ac.setOnClickListener {
            textViewinput.text = ""
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
            else if (method == "-")
            {
                result = input1.toDouble() - input2.toDouble()
            }
            else if (method == "x")
            {
                result = input1.toDouble() * input2.toDouble()
            }
            else if (method == "÷")
            {
                result = input1.toDouble() / input2.toDouble()
            }
            var value = textViewinput.text.toString() + " = " + result.toString()
            textViewinput.text = result.toString()
            val calendar = Calendar.getInstance()
            val formatter = SimpleDateFormat("dd/MM/yy hh:mm:ss")
            ListResult.add(CalculatorResult(value, formatter.format(calendar.time)))
            bt = 1
            input1 = ""
            input2 = ""
            method = ""
        }
    }

    private fun goToSecondActivity() {
        val intent=Intent(this,HistoryRecycleActivity::class.java)
        intent.putExtra("key_result",ListResult)
        //startActivity(intent) // not return data
        //resultLauncherNormal.launcher(intent) // return data
        resultLauncherLambda.launch(intent) // return data
    }
}