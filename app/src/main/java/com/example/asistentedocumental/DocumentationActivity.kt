package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_documentation.*

class DocumentationActivity : AppCompatActivity() {
    var editOk: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_documentation)
        editOk = intent.getBooleanExtra("editOk", false)

        but_asig.setOnClickListener {


            val intent = Intent(this, ProyectAsigActivity::class.java)
            intent.putExtra("editOk", editOk)
            startActivity(intent)
        }

        button1.setOnClickListener {
            var intent = Intent(this,ListEsentialsTest1Activity::class.java)
            startActivity(intent)
        }

    }

}