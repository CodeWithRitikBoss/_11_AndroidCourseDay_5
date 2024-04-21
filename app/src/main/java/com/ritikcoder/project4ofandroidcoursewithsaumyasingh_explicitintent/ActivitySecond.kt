package com.ritikcoder.project4ofandroidcoursewithsaumyasingh_explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivitySecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonPreviousActivity= findViewById<Button>(R.id.buttonForPreviousActivity)

        buttonPreviousActivity.setOnClickListener(){
            intent= Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}