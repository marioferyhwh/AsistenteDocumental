package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.ListQuestType1Adapter
import com.example.asistentedocumental.models.QuestType1
import kotlinx.android.synthetic.main.activity_list_esentials_test1.*

class ListEsentialsTest1Activity : AppCompatActivity() {
    var quests = ArrayList<QuestType1>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_esentials_test1)

        recycleviewlistesentials_test1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        listQuestCreate()
        recycleviewlistesentials_test1.adapter= ListQuestType1Adapter(quests)
    }

    fun listQuestCreate(){
        quests.add(QuestType1( quest = "1",Retie = "0"))
        quests.add(QuestType1( quest = "2",Retie = "90"))
        quests.add(QuestType1( quest = "3",Retie = "009"))
        quests.add(QuestType1( quest = "4",Retie = "0009"))
        quests.add(QuestType1( quest = "5",Retie = "0099"))
        quests.add(QuestType1( quest = "6",Retie = "0009"))
        quests.add(QuestType1( quest = "7",Retie = "00009"))
        quests.add(QuestType1( quest = "8",Retie = "09"))
        quests.add(QuestType1( quest = "9",Retie = "009"))
    }
}