package com.example.testsearchviewwithfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class StartActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atart)

        val name = this.javaClass.canonicalName
        Log.d("omCreate", "We Create now $name")

        button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}