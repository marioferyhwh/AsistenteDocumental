package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ListQuestType1GroupAdapter
import com.example.asistentedocumental.models.QuestType1
import com.example.asistentedocumental.models.QuestType1Group
import kotlinx.android.synthetic.main.activity_lisr_esentials_test2.*
import kotlinx.android.synthetic.main.activity_list_verf_final.*

class ListVerfFinalActivity : AppCompatActivity() {
    var questGroup = ArrayList<QuestType1Group>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_verf_final)
        val formato = intent.getIntExtra("formato", 1)
        listQuestCreate()
        recycleview_finales.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycleview_finales.adapter = ListQuestType1GroupAdapter(questGroup)
    }
    fun listQuestCreate() {
        var quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="1",quest = getString(R.string.l_final1),Retie = ""))
        quests.add(QuestType1(id="1_1",quest = getString(R.string.l_final1_1),Retie = ""))
        quests.add(QuestType1(id="1_2",quest = getString(R.string.l_final1_2),Retie = ""))
        quests.add(QuestType1(id="1_3",quest = getString(R.string.l_final1_3),Retie = ""))
        quests.add(QuestType1(id="1_4",quest = getString(R.string.l_final1_4),Retie = ""))
        quests.add(QuestType1(id="1_5",quest = getString(R.string.l_final1_5),Retie = ""))
        questGroup.add(QuestType1Group(title = getString(R.string.l_final1), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="2",quest = getString(R.string.l_final2),Retie = ""))
        quests.add(QuestType1(id="2_1",quest = getString(R.string.l_final2_1),Retie = ""))
        quests.add(QuestType1(id="2_2",quest = getString(R.string.l_final2_2),Retie = ""))
        quests.add(QuestType1(id="2_3",quest = getString(R.string.l_final2_3),Retie = ""))
        quests.add(QuestType1(id="2_4",quest = getString(R.string.l_final2_4),Retie = ""))
        quests.add(QuestType1(id="2_5",quest = getString(R.string.l_final2_5),Retie = ""))
        quests.add(QuestType1(id="2_6",quest = getString(R.string.l_final2_6),Retie = ""))
        quests.add(QuestType1(id="2_7",quest = getString(R.string.l_final2_7),Retie = ""))
        quests.add(QuestType1(id="2_8",quest = getString(R.string.l_final2_8),Retie = ""))
        questGroup.add(QuestType1Group(title = getString(R.string.l_final2), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="3",quest = getString(R.string.l_final3),Retie = ""))
        quests.add(QuestType1(id="3_1",quest = getString(R.string.l_final3_1),Retie = ""))
        quests.add(QuestType1(id="3_2",quest = getString(R.string.l_final3_2),Retie = ""))
        quests.add(QuestType1(id="3_3",quest = getString(R.string.l_final3_3),Retie = ""))
        quests.add(QuestType1(id="3_4",quest = getString(R.string.l_final3_4),Retie = ""))
        quests.add(QuestType1(id="3_5",quest = getString(R.string.l_final3_5),Retie = ""))
        quests.add(QuestType1(id="3_6",quest = getString(R.string.l_final3_6),Retie = ""))
        quests.add(QuestType1(id="3_7",quest = getString(R.string.l_final3_7),Retie = ""))
        quests.add(QuestType1(id="3_8",quest = getString(R.string.l_final3_8),Retie = ""))
        questGroup.add(QuestType1Group(title = getString(R.string.l_final3), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="4",quest = getString(R.string.l_final4),Retie = ""))
        quests.add(QuestType1(id="4_1",quest = getString(R.string.l_final4_1),Retie = ""))
        quests.add(QuestType1(id="4_2",quest = getString(R.string.l_final4_2),Retie = ""))
        quests.add(QuestType1(id="4_3",quest = getString(R.string.l_final4_3),Retie = ""))
        quests.add(QuestType1(id="4_4",quest = getString(R.string.l_final4_4),Retie = ""))
        quests.add(QuestType1(id="4_5",quest = getString(R.string.l_final4_5),Retie = ""))
        questGroup.add(QuestType1Group(title = getString(R.string.l_final4), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="5",quest = getString(R.string.l_final5),Retie = ""))
        quests.add(QuestType1(id="5_1",quest = getString(R.string.l_final5_1),Retie = ""))
        quests.add(QuestType1(id="5_2",quest = getString(R.string.l_final5_2),Retie = ""))
        quests.add(QuestType1(id="5_3",quest = getString(R.string.l_final5_3),Retie = ""))
        quests.add(QuestType1(id="5_4",quest = getString(R.string.l_final5_4),Retie = ""))
        quests.add(QuestType1(id="5_5",quest = getString(R.string.l_final5_5),Retie = ""))
        quests.add(QuestType1(id="5_6",quest = getString(R.string.l_final5_6),Retie = ""))
        quests.add(QuestType1(id="5_7",quest = getString(R.string.l_final5_7),Retie = ""))
        quests.add(QuestType1(id="5_8",quest = getString(R.string.l_final5_8),Retie = ""))
        quests.add(QuestType1(id="5_9",quest = getString(R.string.l_final5_9),Retie = ""))
        quests.add(QuestType1(id="5_10",quest = getString(R.string.l_final5_10),Retie = ""))
        quests.add(QuestType1(id="5_11",quest = getString(R.string.l_final5_11),Retie = ""))
        questGroup.add(QuestType1Group(title = getString(R.string.l_final5), questGroup = quests))
        quests = ArrayList<QuestType1>()
        //quests.add(QuestType1(id="6",quest = getString(R.string.l_final6),Retie = ""))
        quests.add(QuestType1(id="6_1",quest = getString(R.string.l_final6_1),Retie = ""))
        quests.add(QuestType1(id="6_2",quest = getString(R.string.l_final6_2),Retie = ""))
        quests.add(QuestType1(id="6_3",quest = getString(R.string.l_final6_3),Retie = ""))
        quests.add(QuestType1(id="6_4",quest = getString(R.string.l_final6_4),Retie = ""))
        quests.add(QuestType1(id="6_5",quest = getString(R.string.l_final6_5),Retie = ""))
        quests.add(QuestType1(id="6_6",quest = getString(R.string.l_final6_6),Retie = ""))
        quests.add(QuestType1(id="6_7",quest = getString(R.string.l_final6_7),Retie = ""))
        quests.add(QuestType1(id="6_8",quest = getString(R.string.l_final6_8),Retie = ""))
        quests.add(QuestType1(id="6_9",quest = getString(R.string.l_final6_9),Retie = ""))
        quests.add(QuestType1(id="6_10",quest = getString(R.string.l_final6_10),Retie = ""))
        quests.add(QuestType1(id="6_11",quest = getString(R.string.l_final6_11),Retie = ""))
        quests.add(QuestType1(id="6_12",quest = getString(R.string.l_final6_12),Retie = ""))
        questGroup.add(QuestType1Group(title = getString(R.string.l_final6), questGroup = quests))
    }
}