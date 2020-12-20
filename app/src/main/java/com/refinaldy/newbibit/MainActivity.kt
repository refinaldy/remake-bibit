package com.refinaldy.newbibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search: SearchView = findViewById(R.id.searchView)
    
    }


}