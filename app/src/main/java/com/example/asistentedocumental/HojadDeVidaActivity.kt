package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ListQuestType1GroupAdapter
import com.example.asistentedocumental.adapters.QuestType1GroupAdapter
import com.example.asistentedocumental.models.QuestType1
import com.example.asistentedocumental.models.QuestType1Group
import kotlinx.android.synthetic.main.activity_hojad_de_vida.*

class HojadDeVidaActivity : AppCompatActivity() {
    var questGroup = ArrayList<QuestType1Group>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hojad_de_vida)
        listQuestCreate()
        recycleview_hoja_vida.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recycleview_hoja_vida.adapter = QuestType1GroupAdapter(questGroup)
    }

    fun listQuestCreate() {
        var quests = ArrayList<QuestType1>()
        // quests.add(QuestType1(id="2",quest = getString(R.string.l_hv2)))
        quests.add(QuestType1(id = "2_1", quest = getString(R.string.l_hv2_1)))
        quests.add(QuestType1(id = "2_2", quest = getString(R.string.l_hv2_2)))
        quests.add(QuestType1(id = "2_3", quest = getString(R.string.l_hv2_3)))
        quests.add(QuestType1(id = "2_4", quest = getString(R.string.l_hv2_4)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_hv2), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="3",quest = getString(R.string.l_hv3)))
        quests.add(QuestType1(id = "3_1", quest = getString(R.string.l_hv3_1)))
        quests.add(QuestType1(id = "3_2", quest = getString(R.string.l_hv3_2)))
        quests.add(QuestType1(id = "3_3", quest = getString(R.string.l_hv3_3)))
        quests.add(QuestType1(id = "3_4", quest = getString(R.string.l_hv3_4)))
        quests.add(QuestType1(id = "3_5", quest = getString(R.string.l_hv3_5)))
        quests.add(QuestType1(id = "3_6", quest = getString(R.string.l_hv3_6)))
        quests.add(QuestType1(id = "3_7", quest = getString(R.string.l_hv3_7)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_hv3), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="4",quest = getString(R.string.l_hv4)))
        quests.add(QuestType1(id = "4_1", quest = getString(R.string.l_hv4_1)))
        quests.add(QuestType1(id = "4_2", quest = getString(R.string.l_hv4_2)))
        quests.add(QuestType1(id = "4_3", quest = getString(R.string.l_hv4_3)))
        quests.add(QuestType1(id = "4_4", quest = getString(R.string.l_hv4_4)))
        quests.add(QuestType1(id = "4_5", quest = getString(R.string.l_hv4_5)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_hv4), questGroup = quests))
        quests = ArrayList<QuestType1>()
        // quests.add(QuestType1(id="5",quest = getString(R.string.l_hv5)))
        quests.add(QuestType1(id = "5_1", quest = getString(R.string.l_hv5_1)))
        quests.add(QuestType1(id = "5_2", quest = getString(R.string.l_hv5_2)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_hv5), questGroup = quests))


    }
}