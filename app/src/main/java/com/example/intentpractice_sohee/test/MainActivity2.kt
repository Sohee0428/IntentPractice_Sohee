package com.example.intentpractice_sohee.test

import android.content.Intent
import android.net.Uri
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

        dialBtn2.setOnClickListener {
            val inputPhoneNumber = phoneNumEdt2.text.toString()
            val myUri = Uri.parse("tel:$inputPhoneNumber")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        callBtn2.setOnClickListener {
            val inputPhoneNumber = phoneNumEdt2.text.toString()
            val myUri = Uri.parse("tel:$inputPhoneNumber")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }

        smsBtn2.setOnClickListener {
            val inputPhoneNumber = phoneNumEdt2.text.toString()
            val myUri = Uri.parse("smsto:$inputPhoneNumber")
            val myIntent = Intent(Intent.ACTION_SENDTO, myUri)
             myIntent.putExtra("sms_body","미리 내용 입력")
            startActivity(myIntent)
        }

        naverWebBtn2.setOnClickListener {
            val myUri = Uri.parse("https://naver.com")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)
        }

        kakaoStoreBtn2.setOnClickListener {
            val myUri = Uri.parse("market://details?id=kakao.talk")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)
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