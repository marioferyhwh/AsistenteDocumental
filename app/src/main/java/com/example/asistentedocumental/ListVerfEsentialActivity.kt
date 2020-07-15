package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ListQuestType1GroupAdapter
import com.example.asistentedocumental.models.QuestType1
import com.example.asistentedocumental.models.QuestType1Group
import kotlinx.android.synthetic.main.activity_listt_verf_esential.*

class ListVerfEsentialActivity : AppCompatActivity() {
    var questGroup = ArrayList<QuestType1Group>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listt_verf_esential)
        val formato = intent.getIntExtra("formato", 1)
        listQuestCreate()
        recycleview_esentials.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycleview_esentials.adapter = ListQuestType1GroupAdapter(questGroup)
    }
    fun listQuestCreate() {
        var quests = ArrayList<QuestType1>()
        quests.add(QuestType1(id="1_1",quest = getString(R.string.l_esen1_1),Retie = getString(R.string.l_esen_ret1_1)))
        quests.add(QuestType1(id="1_2",quest = getString(R.string.l_esen1_2),Retie = getString(R.string.l_esen_ret1_2)))
        quests.add(QuestType1(id="1_3",quest = getString(R.string.l_esen1_3),Retie = getString(R.string.l_esen_ret1_3)))
        quests.add(QuestType1(id="1_4",quest = getString(R.string.l_esen1_4),Retie = getString(R.string.l_esen_ret1_4)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen1), questGroup = quests))
        quests = ArrayList<QuestType1>()
        quests.add(QuestType1(id="2_1",quest = getString(R.string.l_esen2_1),Retie = getString(R.string.l_esen_ret2_1)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen2), questGroup = quests))
        quests = ArrayList<QuestType1>()
        // quests.add(QuestType1(id="3",quest = getString(R.string.l_esen3),Retie = ""))
        // quests.add(QuestType1(id="3_1",quest = getString(R.string.l_esen3_1),Retie = ""))
        quests.add(QuestType1(id="3_1_1",quest = getString(R.string.l_esen3_1_1),Retie = getString(R.string.l_esen_ret3_1_1)))
        quests.add(QuestType1(id="3_1_2",quest = getString(R.string.l_esen3_1_2),Retie = getString(R.string.l_esen_ret3_1_2)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen3_1), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="3_2",quest = getString(R.string.l_esen3_2),Retie = getString(R.string.l_esen_ret3_1_2)))
        quests.add(QuestType1(id="3_2_1",quest = getString(R.string.l_esen3_2_1),Retie = getString(R.string.l_esen_ret3_2_1)))
        quests.add(QuestType1(id="3_2_2",quest = getString(R.string.l_esen3_2_2),Retie = getString(R.string.l_esen_ret3_2_2)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen3_2), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="3_3",quest = getString(R.string.l_esen3_3),Retie = getString(R.string.l_esen_ret3_2_2)))
        quests.add(QuestType1(id="3_3_1",quest = getString(R.string.l_esen3_3_1),Retie = getString(R.string.l_esen_ret3_3_1)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen3_3), questGroup = quests))
        quests = ArrayList<QuestType1>()
        // quests.add(QuestType1(id="4",quest = getString(R.string.l_esen4),Retie = ""))
        quests.add(QuestType1(id="4_1",quest = getString(R.string.l_esen4_1),Retie = getString(R.string.l_esen_ret4_1)))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen4), questGroup = quests))
    }
}