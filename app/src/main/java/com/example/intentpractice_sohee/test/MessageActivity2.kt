package com.example.intentpractice_sohee.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice_sohee.R
import kotlinx.android.synthetic.main.activity_message2.*

class MessageActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message2)

        val message = intent.getStringExtra("message")
        receiveMessageTxt2.text = message
    }
}