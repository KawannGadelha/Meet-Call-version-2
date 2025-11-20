package com.example.chamadadevideoteste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chamadadevideoteste.ui.theme.ChamadaDeVideoTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChamadaDeVideoTesteTheme {
                // Chama a nova tela de reunião
                MeetingScreen()
            }
        }
    }
}

// ----------------------------------------------------
// CÓDIGO DA TELA DE REUNIÃO/LOGIN
// ----------------------------------------------------

@Composable
fun MeetingScreen() {
    // Estados para armazenar os valores dos campos de texto
    var meetingId by remember { mutableStateOf("") }
    var userName by remember { mutableStateOf("") }

    // Coluna para alinhar os elementos verticalmente na tela
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF007BFF)), // Fundo AZUL
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Título "Call Meet"
        Text(
            text = "Call Meet",
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 60.dp)
        )

        // Card branco/cinza que contém os campos
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Campo de ID da Reunião
                OutlinedTextField(
                    value = meetingId,
                    onValueChange = { meetingId = it },
                    label = { Text("Meeting ID") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
                )

                // Campo de Nome de Usuário
                OutlinedTextField(
                    value = userName,
                    onValueChange = { userName = it },
                    label = { Text("Your name") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp)
                )

                // Botão "Join Meeting"
                Button(
                    onClick = { /* LÓGICA PARA ENTRAR NA REUNIÃO AQUI */ },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF007BFF)) // Cor do botão (Azul)
                ) {
                    Text("Join Meeting", color = Color.White, fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Botão "Create Meeting"
                Button(
                    onClick = { /* LÓGICA PARA CRIAR REUNIÃO AQUI */ },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray) // Cor secundária
                ) {
                    Text("Create Meeting", color = Color.White, fontSize = 18.sp)
                }
            }
        }
    }
}

// ----------------------------------------------------
// PREVIEW
// ----------------------------------------------------

@Preview(showBackground = true)
@Composable
fun MeetingScreenPreview() {
    ChamadaDeVideoTesteTheme {
        MeetingScreen()
    }
}