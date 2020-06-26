package com.lawlett.kotlinfirstapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var someText: String
    lateinit var someText2: String
    var TEXT_EXTRA: String = "someText"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
first_edit.text
    }

    fun sendForTwo(view: View) {
        someText = first_edit.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(TEXT_EXTRA, someText)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 42 && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                someText2=data.getStringExtra("")
            }
        }
    }
}


