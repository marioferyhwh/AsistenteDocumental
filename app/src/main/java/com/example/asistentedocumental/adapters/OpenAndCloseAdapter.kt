package com.example.asistentedocumental.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.asistentedocumental.R
import com.example.asistentedocumental.models.OpenAndClose

class OpenAndCloseAdapter(val conformes: ArrayList<OpenAndClose>) :
    RecyclerView.Adapter<OpenAndCloseAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_noconformes, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return conformes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binbQuest(conformes[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binbQuest(noconforme: OpenAndClose) {
            var descripcion = itemView.findViewById<TextView>(R.id.textview_id)
            var retie = itemView.findViewById<TextView>(R.id.textview_ret)
            var cierre = itemView.findViewById<TextView>(R.id.textview_close)
            descripcion.text = noconforme.descripcion
            retie.text = noconforme.retie
            cierre.text = noconforme.cierre
        }
    }
}