package com.example.chamadadevideoteste

object AppConstants {

    // Chaves para passar dados entre Activities
    const val MEETING_ID_KEY = "MEETING_ID"
    const val USERNAME_KEY = "USERNAME"

    // App credentials from ZegoCloud
    const val APP_ID: Long = 1779518217
    const val APP_SIGN: String = "14a3464f840f9f9ac58671af19c376fff4e7acc6460209473b96c2de4af930cbd"

    // Função para gerar um ID de reunião aleatório de 10 dígitos
    fun generateRandomMeetingId(): String {
        return (1..10)
            .map { ('0'..'9').random() }
            .joinToString("")
    }
}
