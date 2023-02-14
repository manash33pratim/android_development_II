package com.manash.classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.rating_example)
        val rating1: RatingBar = findViewById(R.id.ratingBar)
        val rating2: RatingBar = findViewById(R.id.ratingBar2)
        val rating3: RatingBar = findViewById(R.id.ratingBar3)
        val rating4: RatingBar = findViewById(R.id.ratingBar5)
        val rating5: RatingBar = findViewById(R.id.ratingBar4);
        val exit=findViewById<Button>(R.id.Exit)
       // val btn: Button = findViewById(R.id.button)




        var x1 = rating1.rating
        var x2 = rating2.rating
        var x3 = rating3.rating
        var x4 = rating4.rating
        //var x5 = rating5.rating
        var av = (x1 + x2 + x3 + x4) / 4
        rating5.rating = av
// btn.setOnClickListener {
// x1 = rating1.rating;
// x2 = rating2.rating;
// x3 = rating3.rating;
// x4 = rating4.rating;
// mean = (x1 + x2 + x3 + x4) / 4;
// rating5.rating = mean;
// }
        rating1.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            x1 = rating;
            av = (x1 + x2 + x3 + x4) / 4
            rating5.rating = av
//            Toast.makeText(this, "you have given new rating $rating \n", Toast.LENGTH_SHORT).show()
//            if (fromUser){
//                Toast.makeText(this, "change done by user", Toast.LENGTH_SHORT).show()
//            }
//            else
//                Toast.makeText(this, "change not done by user", Toast.LENGTH_SHORT).show()

        }
        rating2.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            x2 = rating;
            av = (x1 + x2 + x3 + x4) / 4
            rating5.rating = av
//            Toast.makeText(this, "you have given new rating$rating \n", Toast.LENGTH_SHORT).show()
//            if (fromUser){
//                Toast.makeText(this, "change done by user", Toast.LENGTH_SHORT).show()
//            }
        }
        rating3.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            x3 = rating;
            av = (x1 + x2 + x3 + x4) / 4
            rating5.rating = av
//            Toast.makeText(this, "change done by user $rating \n", Toast.LENGTH_SHORT).show()
//            if (fromUser){
//                Toast.makeText(this, "change done by user", Toast.LENGTH_SHORT).show()
//            }
        }
        rating4.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            x4 = rating;
            av = (x1 + x2 + x3 + x4) / 4
            rating5.rating = av
//            Toast.makeText(this, "you have given new rating$rating \n", Toast.LENGTH_SHORT).show()
//            if (fromUser){
//                Toast.makeText(this, "change done by user", Toast.LENGTH_SHORT).show()
//            }
        }
        rating5.setOnRatingBarChangeListener { ratingBar, fl, b ->

            if (b){
                Toast.makeText(this, "overall change done by user", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, " overall change not done by user", Toast.LENGTH_SHORT).show()
            }
        }

        exit.setOnClickListener {
            finish()
        }


// setContentView(R.layout.activity_main)
// var rating1:RatingBar = findViewById(R.id.ratingBar)
// var rating2:RatingBar = findViewById(R.id.ratingBar2)
// var btn:Button = findViewById(R.id.button)
// btn.setOnClickListener {
// var totalStars = "Total Stars : " + rating1.numStars
// var rating = "Rating : " + rating1.rating
// Toast.makeText(this, "$totalStars $rating".trimIndent(), Toast.LENGTH_LONG).show()
// }
// rating1.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener{
// ratingBar, rating, fromUser ->
// Toast.makeText(this, "rating$rating", Toast.LENGTH_SHORT).show()
// }
    }
}
