package com.manash.classwork

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class NotificationView1 : AppCompatActivity() {
    lateinit var notificationManager:NotificationManager
    lateinit var notificationChannel: NotificationChannel
   lateinit var builder: Notification.Builder
   val channeld="My Channel"
   val notificationId=1234
    val title="Notification"
    val description ="Test My Notification"
   // lateinit var  bt:Button
    lateinit var  pendingIntent: PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notification_view)
        notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val button=findViewById<Button>(R.id.notif)
        val intent=Intent(this,NotificationView2::class.java)
        pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)

        createYourChannel()
        notificationManager.notify(notificationId,builder.build())

    }

    private fun createYourChannel() {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

            notificationChannel= NotificationChannel((channeld,description,
            NotificationManager.IMPORTANCE_HIGH)

            notificationChannel.enableLights(true)
            notificationChannel.enableVibration(true)
            notificationChannel.lightColor=Color.GREEN

            notificationManager.createNotificationChannel(notificationChannel)

            builder =Notification.Builder(this,channeld)
                .setSmallIcon((R.drawable.splash_afterscreen)
                    .setContentTitle(title)
                    .setContentText(description)
                    .setLargeIcon(R.drawable.spalsh_image)
                    .setContentIntent(pendingIntent)
                    .setAutoCancel(true)

            )
        }else{

            builder=Notification.Builder(this)
                .setSmallIcon((R.drawable.splash_background)
                    .setContentTitle(title)
                    .setContentText(description)
                    .setLargeIcon(R.drawable.spalsh_image)
                    .setContentIntent(pendingIntent)
                    .setAutoCancel(true))
        }
    }
}