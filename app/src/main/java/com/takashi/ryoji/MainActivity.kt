package com.takashi.ryoji

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : (Button) = findViewById(R.id.button)

        btn.setOnClickListener{ view ->

            val msg : String = "今晩いかがですか"
            // send message to ryoji-san
        }

    }
}
