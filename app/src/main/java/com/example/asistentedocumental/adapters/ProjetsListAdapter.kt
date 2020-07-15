package com.example.asistentedocumental.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.asistentedocumental.ProyectActivity
import com.example.asistentedocumental.R
import com.example.asistentedocumental.models.Project

class ProjetsListAdapter(val projets:ArrayList<Project>): RecyclerView.Adapter<ProjetsListAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_proyect, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return projets.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binbQuest(projets[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binbQuest(projec: Project) {
            var id = itemView.findViewById<TextView>(R.id.testview_name)
            var estate = itemView.findViewById<TextView>(R.id.testview_estado)
            var numero = itemView.findViewById<TextView>(R.id.testview_numero)
            val button = itemView.findViewById<TextView>(R.id.button)
            id.text = "ID:"+projec.id.toString()
            estate.text = "Cliente:"+projec.client_name.toString()
            numero.text = "#:"+projec.number
            button.setOnClickListener {
                val intent = Intent(itemView.context, ProyectActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }
}