package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ApartEsentialsListAdapter
import com.example.asistentedocumental.adapters.ApartFinalListAdapter
import com.example.asistentedocumental.models.ListVerifEsentials
import com.example.asistentedocumental.models.ListVerifFinal
import kotlinx.android.synthetic.main.activity_list_verf_final_list.*

class ListVerfEsentialListActivity : AppCompatActivity() {
    var esentials = ArrayList<ListVerifEsentials>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_verf_esential_list)
        ReadFinales()
        //traer la lista de todos los proyectos segun perfil y imprimirlos

        recycleview_proyects.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleview_proyects.adapter = ApartEsentialsListAdapter(esentials)
        button.setOnClickListener {
            val apartt = editText.text.toString()
            if (apartt != "") {
                esentials.add(ListVerifEsentials(id = 2, apart = apartt))
                recycleview_proyects.adapter = ApartEsentialsListAdapter(esentials)
            }
        }
    }

    fun ReadFinales() {
        esentials.add(ListVerifEsentials(id = 0, apart = "apartamento 101"))
    }
}