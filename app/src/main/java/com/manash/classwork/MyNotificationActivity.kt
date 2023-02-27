package com.manash.classwork

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MyNotificationActivity : AppCompatActivity() {
    lateinit var notificationManager:NotificationManager
    lateinit var notificationChannel:NotificationChannel
    lateinit var builder:Notification.Builder
    val channeld="My Channel"
    val notificationId=1234
    val title="Notification"
    val description="Test My Notification"
    lateinit var bt:Button
    lateinit var pendingIntent:PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bt=findViewById<Button>(R.id.btnNotify)
        setContentView(R.layout.activity_notification_manager_example)
        notificationManager=getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
        bt.setOnClickListener {
            val intent = Intent(this, MyNotifictionView::class.java)
            pendingIntent = PendingIntent.getActivity(
                this, 0,
                intent, PendingIntent.FLAG_UPDATE_CURRENT
            )
            createYourChannel()
            notificationManager.notify(notificationId,builder.build())
        }

    }
    fun createYourChannel()
    {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            notificationChannel= NotificationChannel(channeld,description,
                NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.enableVibration(true)
            notificationChannel.lightColor=Color.GREEN
            notificationManager.createNotificationChannel(notificationChannel)
            builder=Notification.Builder(this,channeld)
                .setSmallIcon(R.drawable.ic_bell)
                .setContentTitle(title)
                .setContentText(description)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources,
                    R.drawable.logo_toolbar))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
        }
        else
        {
            builder = Notification.Builder(this)
                .setSmallIcon(R.drawable.ic_bell)
                .setContentTitle(title)
                .setContentText(description)
                .setLargeIcon(
                    BitmapFactory.decodeResource(this.resources,
                    R.drawable.logo_toolbar))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
        }
    }

}


