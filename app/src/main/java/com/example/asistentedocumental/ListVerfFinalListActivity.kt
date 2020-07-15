package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ApartFinalListAdapter
import com.example.asistentedocumental.models.ListVerifFinal
import com.example.asistentedocumental.models.Project
import kotlinx.android.synthetic.main.activity_list_verf_final_list.*

class ListVerfFinalListActivity : AppCompatActivity() {
    var finals = ArrayList<ListVerifFinal>()
    var projets = ArrayList<Project>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_verf_final_list)
        ReadFinales()
        //traer la lista de todos los proyectos segun perfil y imprimirlos

        recycleview_proyects.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleview_proyects.adapter = ApartFinalListAdapter(finals)
        button.setOnClickListener {
            val apartt = editText.text.toString()
            if (apartt != "") {
                finals.add(ListVerifFinal(id = 2, apart = apartt))
                recycleview_proyects.adapter = ApartFinalListAdapter(finals)
            }
        }
    }

    fun ReadFinales() {
        finals.add(ListVerifFinal(id = 1, apart = "apartamento 101"))
    }
}