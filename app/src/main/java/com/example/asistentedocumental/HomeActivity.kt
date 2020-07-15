package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ProjetsListAdapter
import com.example.asistentedocumental.models.Project
import com.example.asistentedocumental.models.QuestType1
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var editOk: Boolean = true
    var projets = ArrayList<Project>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        ReadProjets()
        //validar que Perfil de Usuario es
        if (!editOk) {
            but_new_Proyect.isClickable = false
            but_new_Proyect.visibility = View.GONE
        }
        but_new_Proyect?.setOnClickListener {
            startActivity(Intent(this, NewProyectActivity::class.java))
        }
        //traer la lista de todos los proyectos segun perfil y imprimirlos
        recycleview_proyects.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleview_proyects.adapter = ProjetsListAdapter(projets)
    }
    fun ReadProjets(){
        projets.add(Project(id=1,client = 1,client_name = "edificion 2",number = "111111111"))
        projets.add(Project(id=2,client = 2,client_name = "constructora A",number = "1111111211"))
        projets.add(Project(id=3,client = 3,client_name = "constructora A",number = "111331211"))
    }
}