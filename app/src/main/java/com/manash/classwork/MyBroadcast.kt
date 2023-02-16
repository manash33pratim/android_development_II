package com.manash.classwork

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log

class MyBroadcast:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        var mp = MediaPlayer.create(p0, com.manash.classwork.R.raw.alarm)

        Log.d("Hello", "repeating alarm")
        mp.start()
    }
}