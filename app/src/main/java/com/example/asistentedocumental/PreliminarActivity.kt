package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.QuestType1GroupAdapter
import com.example.asistentedocumental.models.QuestType1
import com.example.asistentedocumental.models.QuestType1Group
import kotlinx.android.synthetic.main.activity_preliminar.*

class PreliminarActivity : AppCompatActivity() {
    var questGroup = ArrayList<QuestType1Group>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preliminar)
        listQuestCreate()
        recycleview_preliminar.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recycleview_preliminar.adapter = QuestType1GroupAdapter(questGroup)
    }

    fun listQuestCreate() {
        var quests = ArrayList<QuestType1>()
        quests.add(QuestType1(id="1_1",quest = getString(R.string.l_preliminar1_1)))
        quests.add(QuestType1(id="1_2",quest = getString(R.string.l_preliminar1_2)))
        quests.add(QuestType1(id="1_3",quest = getString(R.string.l_preliminar1_3)))
        quests.add(QuestType1(id="1_4",quest = getString(R.string.l_preliminar1_4)))
        quests.add(QuestType1(id="1_5",quest = getString(R.string.l_preliminar1_5)))
        quests.add(QuestType1(id="1_6",quest = getString(R.string.l_preliminar1_6)))
        quests.add(QuestType1(id="1_7",quest = getString(R.string.l_preliminar1_7)))
        quests.add(QuestType1(id="1_8",quest = getString(R.string.l_preliminar1_8)))
        quests.add(QuestType1(id="2_1",quest = getString(R.string.l_preliminar2_1)))
        quests.add(QuestType1(id="2_2",quest = getString(R.string.l_preliminar2_2)))
        quests.add(QuestType1(id="2_3",quest = getString(R.string.l_preliminar2_3)))
        quests.add(QuestType1(id="2_4",quest = getString(R.string.l_preliminar2_4)))
        questGroup.add(QuestType1Group(title = "preliminares", questGroup = quests))


    }
}