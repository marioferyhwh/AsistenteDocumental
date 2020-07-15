package com.example.asistentedocumental.models

import java.sql.Time

class ListVerifEsentials(
    val id: Int = 0,
    val create_at: Time?,
    val update_at: Time?,
    val delete_at: Time?,
    val apart:String?
)  {
}