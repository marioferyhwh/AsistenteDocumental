package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_proyect_asig.*

class ProyectAsigActivity : AppCompatActivity() {
    var editOk: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyect_asig)
        editOk = intent.getBooleanExtra("editOk", false)

        if (!editOk) {
            but_asig_ok.isClickable = false
            but_asig_ok.visibility = View.GONE
        }
        but_asig_ok?.setOnClickListener {
            //asignar proyecto y retornar
            finish()
        }
    }
}