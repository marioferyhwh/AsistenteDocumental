package com.example.asistentedocumental.models

import java.sql.Time

data class Usuario(
    val id: Int = 0,
    val create_at: Time?,
    val update_at: Time?,
    val delete_at: Time?,
    val correo: String?,
    val password: String?,
    val activo: Boolean = true,
    val nombre: String,
    val cc: String?,
    val matricula: String?,
    val perfil: Int = 1
) {
}
