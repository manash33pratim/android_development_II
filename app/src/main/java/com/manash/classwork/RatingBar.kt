package com.manash.classwork

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rating_bar)

        val submitButton: Button=findViewById(R.id.submit)
        val simpleRatingBar:RatingBar=findViewById(R.id.ratingbar)
        val simpleRating=findViewById<RatingBar>(R.id.rating)


        submitButton.setOnClickListener {
            val totalStars ="Total Stars:: "+ simpleRatingBar.numStars
            val rating= "Rating :: "+ simpleRatingBar.rating

            Toast.makeText(this,"""$totalStars $rating """.trimIndent(),Toast.LENGTH_LONG).show()
        }
        simpleRating.onRatingBarChangeListener=RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"rating $rating ",Toast.LENGTH_LONG).show()
        }
    }
}
