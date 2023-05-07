package com.example.maytinh

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView


class HistoryRecycleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycleview)
        setupList()
    }
    private fun setupList(){
        // actionbar
        supportActionBar?.setTitle("History")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val listData = intent.getStringArrayExtra("key_result")?.toList() ?: listOf<String>()
        val lvHistory = findViewById<RecyclerView>(R.id.rvHistory)
        val adapter = HistoryRecycleAdapter(listData,this)
        lvHistory.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

