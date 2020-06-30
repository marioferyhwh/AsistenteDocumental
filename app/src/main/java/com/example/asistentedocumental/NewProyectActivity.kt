package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_proyect.*

class NewProyectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_proyect)
        but_pr_doc.setOnClickListener {
            val intent =Intent(this, DocumentationActivity::class.java)
            intent.putExtra("editOk",true)
            startActivity(intent)
        }
    }
}