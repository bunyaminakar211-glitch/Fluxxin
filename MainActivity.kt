package com.onlinecall.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt = findViewById<EditText>(R.id.edtTargetId)
        val btn = findViewById<Button>(R.id.btnCall)

        btn.setOnClickListener {
            val intent = Intent(this, CallActivity::class.java)
            intent.putExtra("TARGET_ID", edt.text.toString())
            startActivity(intent)
        }
    }
}
