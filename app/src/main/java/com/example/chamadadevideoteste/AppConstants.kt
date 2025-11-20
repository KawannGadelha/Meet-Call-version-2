package com.example.chamadadevideoteste.constants

object AppConstants {

    // Chaves para passar dados entre Activities
    const val MEETING_ID_KEY = "MEETING_ID"
    const val USERNAME_KEY = "USERNAME"

    // Função para gerar um ID de reunião aleatório de 10 dígitos
    fun generateRandomMeetingId(): String {
        return (1..10)
            .map { ('0'..'9').random() }
            .joinToString("")
    }
}
