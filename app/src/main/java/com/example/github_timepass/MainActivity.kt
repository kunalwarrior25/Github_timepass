package com.example.github_timepass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.Enter)
        button.setOnClickListener(){
            var op = Intent(this,second_activity::class.java)
            startActivity(op)
        }
    }
}