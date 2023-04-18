package com.example.maytinh

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HistoryListViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupList()
    }
    private fun setupList(){
        // actionbar
        supportActionBar?.setTitle("History")
        val listData = intent.getStringArrayExtra("key_result")?.toList() ?: listOf<String>()
        val lvHistory = findViewById<ListView>(R.id.List)
        val adapter = HistoryListViewAdapter(listData,this)
        lvHistory.adapter = adapter
    }
}