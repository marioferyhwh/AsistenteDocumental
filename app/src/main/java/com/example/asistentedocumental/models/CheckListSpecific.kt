package com.example.asistentedocumental.models

import java.sql.Time

data class CheckListSpecific(
    val id: Int = 0,
    val create_at: Time?,
    val update_at: Time?,
    val delete_at: Time?
) {
}