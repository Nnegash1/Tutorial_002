package com.example.tutorial_002 // ktlint-disable package-name

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.title)
        val input = findViewById<TextInputEditText>(R.id.input)
        val button = findViewById<Button>(R.id.submit)

        button.setOnClickListener {
            if (input.text.isNullOrBlank()) {
                textView.text = "Hello World"
            } else {
                textView.text = "Hello, " + input.text
            }
        }
    }
}
