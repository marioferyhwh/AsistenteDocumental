package com.example.asistentedocumental.models

import java.sql.Time

class ListVerifEsentials(
    val id: Int = 0,
    val create_at: Time? = null,
    val update_at: Time? = null,
    val delete_at: Time? = null,
    val apart:String?
)  {
}