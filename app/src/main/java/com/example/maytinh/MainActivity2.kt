package com.example.maytinh

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val value1 = getIntent().getStringExtra("key_1")
        val value2 = getIntent().getStringExtra("key_2")
        val value3 = getIntent().getStringExtra("key_3")
        val textView = findViewById<ListView>(R.id.List)
        val intent = Intent()
        intent.putExtra("Second_key_1","Second Activity")
        setResult(1,intent)
        setupList()
    }
    private fun setupList(){
        val listDate = intent.getStringArrayExtra("key_result")?.toList() ?: listOf<String>()
        val lvHistory = findViewById<ListView>(R.id.List)
        val adapter = HistoryAdapter(listDate,this)
        lvHistory.setAdapter(adapter)
    }
}

