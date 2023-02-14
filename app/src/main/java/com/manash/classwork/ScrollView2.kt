package com.manash.classwork



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScrollView2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)   // vertical
        setContentView(R.layout.activity_scroll_view2) // horizontal
    }
    override fun onBackPressed() {
        super.onBackPressed()

        var intent= Intent(this,RatingExample::class.java)
        startActivity(intent)


    }

}