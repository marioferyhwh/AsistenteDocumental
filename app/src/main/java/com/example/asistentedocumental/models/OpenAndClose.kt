package com.example.asistentedocumental.models

import java.sql.Time

class OpenAndClose(
    val id: Int = 0,
    val create_at: Time? = null,
    val update_at: Time? = null,
    val delete_at: Time? = null,
    val descripcion: String="",
    val retie: String="",
    val cierre: String=""
) {
}