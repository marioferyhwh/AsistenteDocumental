package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_proyect.*

class NewProyect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_proyect)
        but_doc.setOnClickListener {
            startActivity(Intent(this, Documentation::class.java))
        }
    }
}