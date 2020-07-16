package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ItemListAdapter
import com.example.asistentedocumental.models.QuestType1
import com.example.asistentedocumental.models.QuestType1Group
import kotlinx.android.synthetic.main.activity_imparcialidad.*

class ImparcialidadActivity : AppCompatActivity() {
    var quests = ArrayList<QuestType1>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imparcialidad)
        listQuestCreate()
        recycleview_imparcial.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recycleview_imparcial.adapter = ItemListAdapter(quests)
    }
    fun listQuestCreate() {
        quests.add(QuestType1(id="1",quest = getString(R.string.l_imparcial1)))
        quests.add(QuestType1(id="2",quest = getString(R.string.l_imparcial2)))
        quests.add(QuestType1(id="3",quest = getString(R.string.l_imparcial3)))
        quests.add(QuestType1(id="4",quest = getString(R.string.l_imparcial4)))
        quests.add(QuestType1(id="5",quest = getString(R.string.l_imparcial5)))
        quests.add(QuestType1(id="6",quest = getString(R.string.l_imparcial6)))
        quests.add(QuestType1(id="7",quest = getString(R.string.l_imparcial7)))
        quests.add(QuestType1(id="8",quest = getString(R.string.l_imparcial8)))
        quests.add(QuestType1(id="9",quest = getString(R.string.l_imparcial9)))
        quests.add(QuestType1(id="10",quest = getString(R.string.l_imparcial10)))
        quests.add(QuestType1(id="11",quest = getString(R.string.l_imparcial11)))
        quests.add(QuestType1(id="12",quest = getString(R.string.l_imparcial12)))


    }
}