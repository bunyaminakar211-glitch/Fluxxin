package com.onlinecall.app

import android.content.Context
import android.media.AudioManager

class WebRTCClient(private val context: Context) {

    fun startCall(targetId: String) {
        // GERÇEK SES AKIŞI BURADA BAŞLAR
        // Firebase signaling + WebRTC PeerConnection
        // (demo için mantık yerleştirildi)
        println("Calling $targetId")
    }

    fun toggleSpeaker() {
        val audioManager =
            context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.isSpeakerphoneOn = !audioManager.isSpeakerphoneOn
    }
}
