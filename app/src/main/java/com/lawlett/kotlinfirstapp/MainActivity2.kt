package com.lawlett.kotlinfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var someText: String = ""
    var TEXT_EXTRA: String = "someText"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getAnswer()
    }

    fun getAnswer() {
        val intent = Intent()
        someText = intent.getStringExtra(TEXT_EXTRA)
        second_edit.setText(someText)
        second_edit.text
    }
}