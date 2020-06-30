package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //validar que Perfil de Usuario es

        but_new_Proyect?.setOnClickListener {
            startActivity(Intent(this,NewProyectActivity::class.java))
        }
        //traer la lista de todos los proyectos segun perfil y imprimirlos

    }
}