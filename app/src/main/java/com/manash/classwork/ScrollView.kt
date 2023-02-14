package com.manash.classwork



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScrollView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll_view)   // vertical
        //setContentView(R.layout.scroll_view) // horizontal

    }
        override fun onBackPressed() {
            super.onBackPressed()

            var intent=Intent(this,RatingExample::class.java)
            startActivity(intent)


        }


}