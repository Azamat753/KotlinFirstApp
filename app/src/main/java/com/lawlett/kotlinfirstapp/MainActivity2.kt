package com.lawlett.kotlinfirstapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    private  var someText: String = ""
    private  var someText2: String = ""
    private var EXTRA_TEXT: String = "someText"
    private var EXTRA_TEXT2: String = "textFromSecond"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getAnswer()
    }

    fun getAnswer() {
        someText = intent.getStringExtra(EXTRA_TEXT)
        second_edit.setText(someText)
    }

    fun sendForFirst(view: View) {
        someText2 = second_edit.text.toString()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(EXTRA_TEXT2, someText2)
        startActivityForResult(intent,43)
    }
}