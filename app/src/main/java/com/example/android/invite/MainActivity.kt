package com.example.android.invite

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        twitter.setOnClickListener {
            val i = packageManager.getLaunchIntentForPackage("com.twitter.android&hl=en")
            if (i == null) {
                val i1 = Intent()
                i1.action = Intent.ACTION_VIEW
                i1.data = Uri.parse("https://play.google.com/store/apps/details?id=com.twitter.android&hl=en")
                startActivity(i1)

            } else {
                startActivity(i)
            }

        }

        msg.setOnClickListener {
            val i2 = packageManager.getLaunchIntentForPackage("com.google.android.apps.messaging")

            startActivity(i2)
        }

        fb.setOnClickListener {
            val i3 = packageManager.getLaunchIntentForPackage("com.facebook.katana")
            if (i3 == null) {
                val i4 = Intent()
                i4.action = Intent.ACTION_VIEW
                i4.data = Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.katana")
                startActivity(i4)
            } else {
                startActivity(i3)
            }
        }
        email.setOnClickListener {
            val i5 = packageManager.getLaunchIntentForPackage("com.google.android.gm")
            if (i5 == null) {
                val i6 = Intent()
                i6.action = Intent.ACTION_VIEW
                i6.data = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gm")
                startActivity(i6)
            } else {
                startActivity(i5)
            }
        }

    }

}

