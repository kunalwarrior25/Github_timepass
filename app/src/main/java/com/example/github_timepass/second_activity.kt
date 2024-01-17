package com.example.github_timepass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var edit = findViewById<EditText>(R.id.edit)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener() {
            var text = edit.text.toString()
            if (text == ""){
                edit.error = "Enter your name"
            }
            else{
                Toast.makeText(this,"Hello $text",Toast.LENGTH_LONG).show()
            }
        }
    }
}