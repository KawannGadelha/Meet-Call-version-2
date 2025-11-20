package com.example.chamadadevideoteste

import android.R
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class ConferenceActivity : AppCompatActivity() {

    lateinit var meetingID : String
    lateinit var userName : String
    lateinit var meetingIDTextView : TextView
    lateinit var shareBtn : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_conference)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        meetingIDTextView = findViewById(R.id.meeting_id_textview)
        shareBtn = findViewById(R.id.share_btn_imageview)

        meetingID = intent.getStringExtra("MEETING_ID").toString()
        userName = intent.getStringExtra("USERNAME").toString()

        meetingIDTextView.setText("Meeting ID : "+meetingID)


    }


    fun addFragment() {
        val appID: Long = AppConstants.APP_ID
        val appSign: String = AppConstants.APP_SIGN

        var conferenceID: String? = meetingID
        var userID: String? = userName
        var userName: String? = userName

        val config = ZegoUIKitPrebuiltVideoConferenceConfig()
        val fragment = ZegoUIKitPrebuiltVideoConferenceFragment.newInstance(
            appID,
            appSign,
            userID,
            userName,
            conferenceID // <--- O ID da conferência está AQUI, na posição correta
            // REMOVA A LINHA 57 QUE TINHA "conference,"
        )

        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commitNow()
    }



}