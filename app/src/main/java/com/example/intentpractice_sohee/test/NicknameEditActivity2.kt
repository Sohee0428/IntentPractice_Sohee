package com.example.intentpractice_sohee.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice_sohee.R
import kotlinx.android.synthetic.main.activity_nickname_edit2.*

class NicknameEditActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname_edit2)

        okBtn2.setOnClickListener {

            val inputNewNickname = newNicknameEdt2.text.toString()
            val resultIntent = Intent()

            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}