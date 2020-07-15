package com.example.asistentedocumental.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.asistentedocumental.R
import com.example.asistentedocumental.models.QuestType1Group

class ListQuestType1GroupAdapter(val quests: ArrayList<QuestType1Group>) :RecyclerView .Adapter<ListQuestType1GroupAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test2_group, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return quests.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binbQuest(quests[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binbQuest(questGroup: QuestType1Group) {
            val title = itemView.findViewById<TextView>(R.id.textview_title)
            val recyclerView = itemView.findViewById<RecyclerView>(R.id.recycleviewlistesentials_test2Group)

            title.text = questGroup.title.toString()

            recyclerView.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.VERTICAL,false)
            recyclerView.adapter = ListQuestType1Adapter(questGroup.questGroup)

        }
    }

}