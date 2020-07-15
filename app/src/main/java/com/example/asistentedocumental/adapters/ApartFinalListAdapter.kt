package com.example.asistentedocumental.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.asistentedocumental.ListVerfEsentialActivity
import com.example.asistentedocumental.ListVerfFinalActivity
import com.example.asistentedocumental.R
import com.example.asistentedocumental.models.ListVerifFinal

class ApartFinalListAdapter (val esentials:ArrayList<ListVerifFinal>): RecyclerView.Adapter<ApartFinalListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_verifi_2, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return esentials.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binbQuest(esentials[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binbQuest(projec: ListVerifFinal) {
            var id = itemView.findViewById<TextView>(R.id.testview_id)
            var descrip = itemView.findViewById<TextView>(R.id.testview_des)
            val button  = itemView.findViewById<Button>(R.id.button)
            id.text = "ID:"+projec.id.toString()
            descrip.text = "Lugar:"+projec.apart.toString()
            button.setOnClickListener {
                val intent = Intent(itemView.context, ListVerfFinalActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }
}