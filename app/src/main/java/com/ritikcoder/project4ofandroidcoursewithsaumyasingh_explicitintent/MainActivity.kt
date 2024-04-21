package com.ritikcoder.project4ofandroidcoursewithsaumyasingh_explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intents in Android development.
        //-> There are two type of intent in Android.
            //-> Implicit intent.
            //-> Explicit intent.

        //* Explicit Intent (With in Application)
            //-> When ever we will change one screen to the another screen with in one the app
            //   that is called Explicit Intent in Android.
        //* Implicit Intent
            //-> When ever we will change screens one app to another app that is called Implicit intent in Android.

        //Here in this Project we will follow Explicit intent.

        val buttonNextActivity= findViewById<Button>(R.id.buttonForNextActivity)

        buttonNextActivity.setOnClickListener(){
            intent= Intent(applicationContext, ActivitySecond::class.java)
            startActivity(intent)
        }

    }
}