package com.lawlett.kotlinfirstapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*


@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class MainActivity : AppCompatActivity() {
   private lateinit var someText: String
   private lateinit var someText2: String
    var TEXT_EXTRA: String = "someText"
    var TEXT_EXTRA2: String = "textFromSecond"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAnswer()
    }

    fun sendForTwo(view: View) {
        someText = first_edit.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(TEXT_EXTRA, someText)
        startActivityForResult(intent,42)
    }
    fun getAnswer() {
        if (intent.getStringExtra(TEXT_EXTRA2) != null) {
            someText2 = intent.getStringExtra(TEXT_EXTRA2)
            first_edit.setText(someText2)
        }
    }

}


