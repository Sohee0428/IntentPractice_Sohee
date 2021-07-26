package com.example.intentpractice_sohee.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice_sohee.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        moveToOtherBtn2.setOnClickListener {

            val myIntent = Intent(this, OtherActivity2::class.java)
            startActivity(myIntent)
        }

        sendMessageBtn2.setOnClickListener {

            val message = messageEdt2.text.toString()
            val myIntent = Intent(this, MessageActivity2::class.java)

            myIntent.putExtra("message", message)
            startActivity(myIntent)
        }

        editNicknameBtn2.setOnClickListener {

            val myIntent = Intent(this, NicknameEditActivity2::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_FOR_NICKNAME) {

            if(resultCode == RESULT_OK) {

                val newNickname = data?.getStringExtra("nickname")

                nicknameTxt2.text = newNickname
            }
        }
    }
}