package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asistentedocumental.models.ListVerifFinal

class ListVerfFinalListActivity : AppCompatActivity() {
    var finals = ArrayList<ListVerifFinal>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_verf_final_list)

        finals.add(ListVerifFinal(id = 1, apart = "101"))
        //traer la lista de todos los proyectos segun perfil y imprimirlos
        /*
        recycleview_final_list.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleview_final_list.adapter = ApartFinalListAdapter(finals)

         */

    }
}