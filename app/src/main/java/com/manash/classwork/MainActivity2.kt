package com.manash.classwork

import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val res = findViewById<TextView>(R.id.res)

        val t1 = intent.getStringExtra("name")
        val t2 = intent.getStringExtra("course")
        val t3 = intent.getStringExtra("email")
        val t4 = intent.getStringExtra("date")
        val t5 = intent.getStringExtra("phone")


        res.text = " Entered Values are : \n " +
                "Name : ${t1} \n" +
                "Course : ${t2} \n" +
                "Email : ${t3} \n" +
                "DOB : ${t4} \n" +
                "Phone No. : ${t5} \n "

    }
}