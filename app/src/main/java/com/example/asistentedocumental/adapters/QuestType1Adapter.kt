package com.example.asistentedocumental.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.asistentedocumental.R
import com.example.asistentedocumental.models.QuestType1

class QuestType1Adapter(val quests: ArrayList<QuestType1>) :
    RecyclerView.Adapter<QuestType1Adapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quest_type_1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return quests.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binbQuest(quests[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binbQuest(questSelect: QuestType1) {
            var quest = itemView.findViewById<TextView>(R.id.textview_quest)
            var spinner = itemView.findViewById<Spinner>(R.id.spinner)
            quest.text = questSelect.quest.toString()
        }
    }
}