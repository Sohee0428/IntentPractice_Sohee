package com.example.intentpractice_sohee.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice_sohee.R
import kotlinx.android.synthetic.main.activity_other2.*

class OtherActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other2)

        returnToMainBtn2.setOnClickListener {
            finish()
        }
    }
}