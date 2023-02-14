package com.manash.classwork

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity



class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
          Handler().postDelayed(Runnable {
              val i = Intent(this@SplashScreen, SplashScreenNext::class.java)
              startActivity(i)
              finish()
          }, 5000)

        /*Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this@SplashScreen , SplashScreenNext::class.java)
            startActivity(i)
            finish()
        }, 5000)*/

    }
}