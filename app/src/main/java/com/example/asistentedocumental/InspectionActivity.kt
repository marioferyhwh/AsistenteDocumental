package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inspection.*

class InspectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inspection)
        but_doc.setOnClickListener {
            startActivity(Intent(this, DocumentationActivity::class.java))
        }
        but_doc_2.setOnClickListener {
            startActivity(Intent(this, InspectionOthers::class.java))
        }
    }
}