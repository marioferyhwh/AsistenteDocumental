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

        recycleviewlistesentials_test1.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        listQuestCreate()
        recycleviewlistesentials_test1.adapter = ListQuestType1Adapter(quests)
    }

    fun listQuestCreate() {


        quests.add(QuestType1(id="1_1",quest = getString(R.string.l_esen1_1),Retie = getString(R.string.l_esen_ret1_1)))

        quests.add(QuestType1(id="1_2",quest = getString(R.string.l_esen1_2),Retie = getString(R.string.l_esen_ret1_2)))

        quests.add(QuestType1(id="1_3",quest = getString(R.string.l_esen1_3),Retie = getString(R.string.l_esen_ret1_3)))

        quests.add(QuestType1(id="1_4",quest = getString(R.string.l_esen1_4),Retie = getString(R.string.l_esen_ret1_4)))

        quests.add(QuestType1(id="2",quest = getString(R.string.l_esen2),Retie = ""))
        quests.add(QuestType1(id="2_1",quest = getString(R.string.l_esen2_1),Retie = getString(R.string.l_esen_ret2_1)))

        quests.add(QuestType1(id="3",quest = getString(R.string.l_esen3),Retie = ""))
        quests.add(QuestType1(id="3_1",quest = getString(R.string.l_esen3_1),Retie = ""))
        quests.add(QuestType1(id="3_1_1",quest = getString(R.string.l_esen3_1_1),Retie = getString(R.string.l_esen_ret3_1_1)))

        quests.add(QuestType1(id="3_1_2",quest = getString(R.string.l_esen3_1_2),Retie = getString(R.string.l_esen_ret3_1_2)))

        quests.add(QuestType1(id="3_2",quest = getString(R.string.l_esen3_2),Retie = getString(R.string.l_esen_ret3_1_2)))
        quests.add(QuestType1(id="3_2_1",quest = getString(R.string.l_esen3_2_1),Retie = getString(R.string.l_esen_ret3_2_1)))

        quests.add(QuestType1(id="3_2_2",quest = getString(R.string.l_esen3_2_2),Retie = getString(R.string.l_esen_ret3_2_2)))

        quests.add(QuestType1(id="3_3",quest = getString(R.string.l_esen3_3),Retie = getString(R.string.l_esen_ret3_2_2)))
        quests.add(QuestType1(id="3_3_1",quest = getString(R.string.l_esen3_3_1),Retie = getString(R.string.l_esen_ret3_3_1)))

        quests.add(QuestType1(id="4",quest = getString(R.string.l_esen4),Retie = ""))
        quests.add(QuestType1(id="4_1",quest = getString(R.string.l_esen4_1),Retie = getString(R.string.l_esen_ret4_1)))

        quests.add(QuestType1(id="5",quest = getString(R.string.l_esen5),Retie = ""))
        quests.add(QuestType1(id="5_1",quest = getString(R.string.l_esen5_1),Retie = getString(R.string.l_esen_ret5_1)))

        quests.add(QuestType1(id="5_2",quest = getString(R.string.l_esen5_2),Retie = getString(R.string.l_esen_ret5_2)))

        quests.add(QuestType1(id="6",quest = getString(R.string.l_esen6),Retie = ""))
        quests.add(QuestType1(id="6_1",quest = getString(R.string.l_esen6_1),Retie = ""))
        quests.add(QuestType1(id="6_1_1",quest = getString(R.string.l_esen6_1_1),Retie = getString(R.string.l_esen_ret6_1_1)))

        quests.add(QuestType1(id="6_2",quest = getString(R.string.l_esen6_2),Retie = getString(R.string.l_esen_ret6_1_1)))
        quests.add(QuestType1(id="6_2_1",quest = getString(R.string.l_esen6_2_1),Retie = getString(R.string.l_esen_ret6_2_1)))

        quests.add(QuestType1(id="6_2_2",quest = getString(R.string.l_esen6_2_2),Retie = getString(R.string.l_esen_ret6_2_2)))

        quests.add(QuestType1(id="6_2_3",quest = getString(R.string.l_esen6_2_3),Retie = getString(R.string.l_esen_ret6_2_3)))

        quests.add(QuestType1(id="6_3",quest = getString(R.string.l_esen6_3),Retie = getString(R.string.l_esen_ret6_2_3)))
        quests.add(QuestType1(id="6_3_1",quest = getString(R.string.l_esen6_3_1),Retie = getString(R.string.l_esen_ret6_3_1)))

        quests.add(QuestType1(id="6_4",quest = getString(R.string.l_esen6_4),Retie = getString(R.string.l_esen_ret6_3_1)))
        quests.add(QuestType1(id="6_4_1",quest = getString(R.string.l_esen6_4_1),Retie = getString(R.string.l_esen_ret6_4_1)))

        quests.add(QuestType1(id="6_4_2",quest = getString(R.string.l_esen6_4_2),Retie = getString(R.string.l_esen_ret6_4_2)))

        quests.add(QuestType1(id="6_4_3",quest = getString(R.string.l_esen6_4_3),Retie = getString(R.string.l_esen_ret6_4_3)))

        quests.add(QuestType1(id="6_4_4",quest = getString(R.string.l_esen6_4_4),Retie = getString(R.string.l_esen_ret6_4_4)))

        quests.add(QuestType1(id="6_4_5",quest = getString(R.string.l_esen6_4_5),Retie = getString(R.string.l_esen_ret6_4_5)))

        quests.add(QuestType1(id="6_5",quest = getString(R.string.l_esen6_5),Retie = getString(R.string.l_esen_ret6_4_5)))
        quests.add(QuestType1(id="6_5_1",quest = getString(R.string.l_esen6_5_1),Retie = getString(R.string.l_esen_ret6_5_1)))

        quests.add(QuestType1(id="6_6",quest = getString(R.string.l_esen6_6),Retie = getString(R.string.l_esen_ret6_5_1)))
        quests.add(QuestType1(id="6_6_1",quest = getString(R.string.l_esen6_6_1),Retie = getString(R.string.l_esen_ret6_6_1)))

        quests.add(QuestType1(id="6_7",quest = getString(R.string.l_esen6_7),Retie = getString(R.string.l_esen_ret6_6_1)))
        quests.add(QuestType1(id="6_7_1",quest = getString(R.string.l_esen6_7_1),Retie = getString(R.string.l_esen_ret6_7_1)))

        quests.add(QuestType1(id="6_8",quest = getString(R.string.l_esen6_8),Retie = getString(R.string.l_esen_ret6_7_1)))
        quests.add(QuestType1(id="6_8_1",quest = getString(R.string.l_esen6_8_1),Retie = getString(R.string.l_esen_ret6_8_1)))

        quests.add(QuestType1(id="6_9",quest = getString(R.string.l_esen6_9),Retie = getString(R.string.l_esen_ret6_8_1)))
        quests.add(QuestType1(id="6_9_1",quest = getString(R.string.l_esen6_9_1),Retie = getString(R.string.l_esen_ret6_9_1)))

        quests.add(QuestType1(id="6_10",quest = getString(R.string.l_esen6_10),Retie = getString(R.string.l_esen_ret6_9_1)))
        quests.add(QuestType1(id="6_10_1",quest = getString(R.string.l_esen6_10_1),Retie = getString(R.string.l_esen_ret6_10_1)))

        quests.add(QuestType1(id="6_10_2",quest = getString(R.string.l_esen6_10_2),Retie = getString(R.string.l_esen_ret6_10_2)))

        quests.add(QuestType1(id="6_10_3",quest = getString(R.string.l_esen6_10_3),Retie = getString(R.string.l_esen_ret6_10_3)))

        quests.add(QuestType1(id="6_10_4",quest = getString(R.string.l_esen6_10_4),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_a",quest = getString(R.string.l_esen6_10_4_a),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_b",quest = getString(R.string.l_esen6_10_4_b),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_c",quest = getString(R.string.l_esen6_10_4_c),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_d",quest = getString(R.string.l_esen6_10_4_d),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_e",quest = getString(R.string.l_esen6_10_4_e),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_f",quest = getString(R.string.l_esen6_10_4_f),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_g",quest = getString(R.string.l_esen6_10_4_g),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_h",quest = getString(R.string.l_esen6_10_4_h),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_4_i",quest = getString(R.string.l_esen6_10_4_i),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_10_5_j",quest = getString(R.string.l_esen6_10_5_j),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_11",quest = getString(R.string.l_esen6_11),Retie = getString(R.string.l_esen_ret6_10_4)))
        quests.add(QuestType1(id="6_11_1",quest = getString(R.string.l_esen6_11_1),Retie = getString(R.string.l_esen_ret6_11_1)))

        quests.add(QuestType1(id="6_11_2",quest = getString(R.string.l_esen6_11_2),Retie = getString(R.string.l_esen_ret6_11_2)))

        quests.add(QuestType1(id="6_11_3",quest = getString(R.string.l_esen6_11_3),Retie = getString(R.string.l_esen_ret6_11_3)))

        quests.add(QuestType1(id="6_11_4",quest = getString(R.string.l_esen6_11_4),Retie = getString(R.string.l_esen_ret6_11_4)))

        quests.add(QuestType1(id="6_11_5",quest = getString(R.string.l_esen6_11_5),Retie = getString(R.string.l_esen_ret6_11_5)))

        quests.add(QuestType1(id="6_11_6",quest = getString(R.string.l_esen6_11_6),Retie = getString(R.string.l_esen_ret6_11_6)))

        quests.add(QuestType1(id="6_11_7",quest = getString(R.string.l_esen6_11_7),Retie = getString(R.string.l_esen_ret6_11_7)))

        quests.add(QuestType1(id="6_12",quest = getString(R.string.l_esen6_12),Retie = getString(R.string.l_esen_ret6_11_7)))
        quests.add(QuestType1(id="6_12_1",quest = getString(R.string.l_esen6_12_1),Retie = getString(R.string.l_esen_ret6_12_1)))

        quests.add(QuestType1(id="6_12_2",quest = getString(R.string.l_esen6_12_2),Retie = getString(R.string.l_esen_ret6_12_2)))

        quests.add(QuestType1(id="6_12_3",quest = getString(R.string.l_esen6_12_3),Retie = getString(R.string.l_esen_ret6_12_3)))

        quests.add(QuestType1(id="6_12_4",quest = getString(R.string.l_esen6_12_4),Retie = getString(R.string.l_esen_ret6_12_4)))

        quests.add(QuestType1(id="6_12_5",quest = getString(R.string.l_esen6_12_5),Retie = getString(R.string.l_esen_ret6_12_5)))

        quests.add(QuestType1(id="6_12_6",quest = getString(R.string.l_esen6_12_6),Retie = getString(R.string.l_esen_ret6_12_6)))

        quests.add(QuestType1(id="6_12_7",quest = getString(R.string.l_esen6_12_7),Retie = getString(R.string.l_esen_ret6_12_7)))

        quests.add(QuestType1(id="6_12_8",quest = getString(R.string.l_esen6_12_8),Retie = getString(R.string.l_esen_ret6_12_8)))

        quests.add(QuestType1(id="6_12_9",quest = getString(R.string.l_esen6_12_9),Retie = getString(R.string.l_esen_ret6_12_9)))

        quests.add(QuestType1(id="6_12_10",quest = getString(R.string.l_esen6_12_10),Retie = getString(R.string.l_esen_ret6_12_10)))

        quests.add(QuestType1(id="6_12_11",quest = getString(R.string.l_esen6_12_11),Retie = getString(R.string.l_esen_ret6_12_11)))

        quests.add(QuestType1(id="6_12_12",quest = getString(R.string.l_esen6_12_12),Retie = getString(R.string.l_esen_ret6_12_12)))
        quests.add(QuestType1(id="6_12_12_a",quest = getString(R.string.l_esen6_12_12_a),Retie = getString(R.string.l_esen_ret6_12_12)))
        quests.add(QuestType1(id="6_12_12_b",quest = getString(R.string.l_esen6_12_12_b),Retie = getString(R.string.l_esen_ret6_12_12)))
        quests.add(QuestType1(id="6_12_12_c",quest = getString(R.string.l_esen6_12_12_c),Retie = getString(R.string.l_esen_ret6_12_12)))
        quests.add(QuestType1(id="6_12_12_d",quest = getString(R.string.l_esen6_12_12_d),Retie = getString(R.string.l_esen_ret6_12_12)))
        quests.add(QuestType1(id="6_12_12_e",quest = getString(R.string.l_esen6_12_12_e),Retie = getString(R.string.l_esen_ret6_12_12)))
        quests.add(QuestType1(id="6_12_13",quest = getString(R.string.l_esen6_12_13),Retie = getString(R.string.l_esen_ret6_12_13)))

        quests.add(QuestType1(id="6_12_14",quest = getString(R.string.l_esen6_12_14),Retie = getString(R.string.l_esen_ret6_12_14)))

        quests.add(QuestType1(id="6_12_15",quest = getString(R.string.l_esen6_12_15),Retie = getString(R.string.l_esen_ret6_12_15)))

        quests.add(QuestType1(id="6_12_16",quest = getString(R.string.l_esen6_12_16),Retie = getString(R.string.l_esen_ret6_12_16)))

        quests.add(QuestType1(id="6_12_17",quest = getString(R.string.l_esen6_12_17),Retie = getString(R.string.l_esen_ret6_12_17)))

        quests.add(QuestType1(id="6_13",quest = getString(R.string.l_esen6_13),Retie = getString(R.string.l_esen_ret6_12_17)))
        quests.add(QuestType1(id="6_13_1",quest = getString(R.string.l_esen6_13_1),Retie = getString(R.string.l_esen_ret6_13_1)))

        quests.add(QuestType1(id="6_13_2",quest = getString(R.string.l_esen6_13_2),Retie = getString(R.string.l_esen_ret6_13_2)))

        quests.add(QuestType1(id="6_13_3",quest = getString(R.string.l_esen6_13_3),Retie = getString(R.string.l_esen_ret6_13_3)))


        quests.add(QuestType1(id="6_13_4",quest = getString(R.string.l_esen6_13_4),Retie = getString(R.string.l_esen_ret6_13_4)))

        quests.add(QuestType1(id="6_14",quest = getString(R.string.l_esen6_14),Retie = getString(R.string.l_esen_ret6_13_4)))
        quests.add(QuestType1(id="6_14_1",quest = getString(R.string.l_esen6_14_1),Retie = getString(R.string.l_esen_ret6_14_1)))

        quests.add(QuestType1(id="6_14_2",quest = getString(R.string.l_esen6_14_2),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_a",quest = getString(R.string.l_esen6_14_2_a),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_b",quest = getString(R.string.l_esen6_14_2_b),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_c",quest = getString(R.string.l_esen6_14_2_c),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_d",quest = getString(R.string.l_esen6_14_2_d),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_e",quest = getString(R.string.l_esen6_14_2_e),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_f",quest = getString(R.string.l_esen6_14_2_f),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_2_g",quest = getString(R.string.l_esen6_14_2_g),Retie = getString(R.string.l_esen_ret6_14_2)))
        quests.add(QuestType1(id="6_14_3",quest = getString(R.string.l_esen6_14_3),Retie = getString(R.string.l_esen_ret6_14_3)))

        quests.add(QuestType1(id="6_15",quest = getString(R.string.l_esen6_15),Retie = getString(R.string.l_esen_ret6_14_3)))
        quests.add(QuestType1(id="6_15_1",quest = getString(R.string.l_esen6_15_1),Retie = getString(R.string.l_esen_ret6_15_1)))

        quests.add(QuestType1(id="6_15_2",quest = getString(R.string.l_esen6_15_2),Retie = getString(R.string.l_esen_ret6_15_2)))

        quests.add(QuestType1(id="6_15_3",quest = getString(R.string.l_esen6_15_3),Retie = getString(R.string.l_esen_ret6_15_3)))

        quests.add(QuestType1(id="6_15_4",quest = getString(R.string.l_esen6_15_4),Retie = getString(R.string.l_esen_ret6_15_4)))

        quests.add(QuestType1(id="6_15_5",quest = getString(R.string.l_esen6_15_5),Retie = getString(R.string.l_esen_ret6_15_5)))

        quests.add(QuestType1(id="6_16",quest = getString(R.string.l_esen6_16),Retie = getString(R.string.l_esen_ret6_15_5)))
        quests.add(QuestType1(id="6_16_1",quest = getString(R.string.l_esen6_16_1),Retie = getString(R.string.l_esen_ret6_16_1)))

        quests.add(QuestType1(id="7",quest = getString(R.string.l_esen7),Retie = ""))
        quests.add(QuestType1(id="7_1",quest = getString(R.string.l_esen7_1),Retie = getString(R.string.l_esen_ret7_1)))

        quests.add(QuestType1(id="7_2",quest = getString(R.string.l_esen7_2),Retie = getString(R.string.l_esen_ret7_2)))



    }
}