package com.example.asistentedocumental.models

import java.sql.Time
import javax.sql.StatementEvent

data class Project(
    val id: Int = 0,
    val create_at: Time?,
    val update_at: Time?,
    val delete_at: Time?,
    val client: Int,
    val user:Int,
    val number: String,

    val doc_1: String="",
    val doc_2: String="",
    val doc_3: String="",
    val doc_4: String="",
    val doc_5: String="",

    val im_ok:Boolean = false,

    val pre_1:Int=0,
    val pre_1_1:String="",
    val pre_2:Int=0,
    val pre_2_1:String="",
    val pre_3:Int=0,
    val pre_3_1:String="",
    val pre_4:Int=0,
    val pre_4_1:String="",
    val pre_5:Int=0,
    val pre_5_1:String="",
    val pre_6:Int=0,
    val pre_6_1:String="",
    val pre_7:Int=0,
    val pre_7_1:String="",
    val pre_8:Int=0,
    val pre_8_1:String="",
    val pre_9:Int=0,
    val pre_9_1:String="",
    val pre_10:Int=0,
    val pre_10_1:String="",
    val pre_11:Int=0,
    val pre_11_1:String="",
    val pre_12:Int=0,
    val pre_12_1:String="",
    val pre_13:Int=0,
    val pre_13_1:String="",
    val pre_14:String="",
    val pre_ok:Boolean=false,

    val hv_number:String,
    val hv_cotizacion:String,
    val hv_dictamen:String,
    val hv_1:String="",
    val hv_2:String="",
    val hv_3:String="",
    val hv_4:String="",
    val hv_5:String="",
    val hv_6:String="",
    val hv_7:Int=0,
    val hv_8:Int=0,
    val hv_9:Int=0,
    val hv_10:Int=0,
    val hv_11:Int=0,
    val hv_12:Int=0,
    val hv_13:Int=0,
    val hv_14:Int=0,
    val hv_15:Int=0,
    val hv_16:Int=0,
    val hv_17:Int=0,
    val hv_18:Int=0,
    val hv_19:Int=0,
    val hv_20:Int=0,
    val hv_21:Int=0,
    val hv_22:Int=0,
    val hv_23:Int=0,
    val hv_24:Int=0,
    val hv_25:String="",
    val hv_ok:Boolean=false
) {
}