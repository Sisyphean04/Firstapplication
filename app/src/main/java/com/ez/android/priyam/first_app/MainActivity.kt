package com.ez.android.priyam.first_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val Extra_message = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View)

    {
       val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply{
            putExtra(Extra_message,message)  }

        startActivity(intent)
    }
}








