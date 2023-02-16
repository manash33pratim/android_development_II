package com.manash.classwork

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TimePickerExample : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.time_picker_example)
        var start=findViewById<Button>(R.id.start)
        var repeat=findViewById<Button>(R.id.repeat)
        var et=findViewById<EditText>(R.id.et)
        var alarmManager:AlarmManager
        var cancel=findViewById<Button>(R.id.cancel)
        val i=Intent(this,MyBroadcast::class.java)
        var pendingIntent=PendingIntent.getBroadcast(this,
            0,i,PendingIntent.FLAG_UPDATE_CURRENT)
        start.setOnClickListener{
            var l=et.text.toString().toInt()
            alarmManager=getSystemService(Context.ALARM_SERVICE)as AlarmManager
            alarmManager.set(AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis()+(l*1000),pendingIntent)
            Toast.makeText(this,"Alarm  set",Toast.LENGTH_LONG).show()
        }
        repeat.setOnClickListener {
            val e=et.text.toString().toInt()
            alarmManager=getSystemService(Context.ALARM_SERVICE)as AlarmManager
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()
                ,5000,pendingIntent)
            Toast.makeText(this,"Repeat Alarm is Set ",Toast.LENGTH_LONG).show()

        }
        cancel.setOnClickListener {
            alarmManager=getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this,"Alarm Cancelled",Toast.LENGTH_LONG).show()
        }
    }
}