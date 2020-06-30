package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_proyect.*

class ProyectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyect)
        but_pr_doc.setOnClickListener {
            startActivity(Intent(this, DocumentationActivity::class.java))
        }
    }
}