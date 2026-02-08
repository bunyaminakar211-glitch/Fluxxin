package com.onlinecall.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CallActivity : AppCompatActivity() {

    private lateinit var webRTCClient: WebRTCClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        val targetId = intent.getStringExtra("TARGET_ID") ?: return

        webRTCClient = WebRTCClient(this)
        webRTCClient.startCall(targetId)

        findViewById<Button>(R.id.btnSpeaker).setOnClickListener {
            webRTCClient.toggleSpeaker()
        }
    }
}
