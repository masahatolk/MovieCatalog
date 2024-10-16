package com.hits.moviecatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hits.moviecatalog.ui.welcomescreen.WelcomeFragment

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sign)

        val welcomeFragment = WelcomeFragment()

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root_container, welcomeFragment)
                .commitAllowingStateLoss()
        }
    }
}