package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ListQuestType1GroupAdapter
import com.example.asistentedocumental.adapters.ListQuestType2GroupAdapter
import com.example.asistentedocumental.models.QuestType1
import com.example.asistentedocumental.models.QuestType1Group
import kotlinx.android.synthetic.main.activity_lisr_esentials_test2.*

class ListEsentialsTest2Activity : AppCompatActivity() {
    var questGroup = ArrayList<QuestType1Group>()
    var quests = ArrayList<QuestType1>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lisr_esentials_test2)
        val formato = intent.getIntExtra("formato", 1)
        listQuestCreate()

        when (formato) {

            2 -> {
                recycleviewlistesentials_test2.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
                recycleviewlistesentials_test2.adapter = ListQuestType1GroupAdapter(questGroup)
            }
            3 -> {
                recycleviewlistesentials_test2.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                recycleviewlistesentials_test2.adapter = ListQuestType2GroupAdapter(questGroup)
            }
            else -> {
                recycleviewlistesentials_test2.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                recycleviewlistesentials_test2.adapter = ListQuestType1GroupAdapter(questGroup)
            }
            /*   4->{
                   recycleviewlistesentials_test2.layoutManager =
                       LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
                   recycleviewlistesentials_test2.adapter = ListQuestType2GroupAdapter(questGroup)
               }*/
        }
    }


    fun listQuestCreate() {
        quests.add(
            QuestType1(
                id = "1_1",
                quest = getString(R.string.l_esen1_1),
                Retie = getString(R.string.l_esen_ret1_1)
            )
        )
        quests.add(
            QuestType1(
                id = "1_2",
                quest = getString(R.string.l_esen1_2),
                Retie = getString(R.string.l_esen_ret1_2)
            )
        )
        quests.add(
            QuestType1(
                id = "1_3",
                quest = getString(R.string.l_esen1_3),
                Retie = getString(R.string.l_esen_ret1_3)
            )
        )
        quests.add(
            QuestType1(
                id = "1_4",
                quest = getString(R.string.l_esen1_4),
                Retie = getString(R.string.l_esen_ret1_4)
            )
        )

        questGroup.add(QuestType1Group(title = "1__--", questGroup = quests))
        questGroup.add(QuestType1Group(title = getString(R.string.l_esen2), questGroup = quests))
        questGroup.add(QuestType1Group(title = "3__--", questGroup = quests))
    }
}