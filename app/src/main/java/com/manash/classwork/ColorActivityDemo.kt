package com.manash.classwork

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ColorActivityDemo : AppCompatActivity(),ColorInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_demo)
    }


    override fun newColor(color: Color) {
        val f=supportFragmentManager.findFragmentByTag("frag2")as ColorFragmentDemo2
        f.updateColor(Color.GRAY)
    }
}