package com.manash.classwork

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class JobScheduler : AppCompatActivity() {
    var jobScheduler: JobScheduler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.job_scheduler)
        val start=findViewById<Button>(R.id.start)
        val stop=findViewById<Button>(R.id.stop)
        start.setOnClickListener {
            jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE)as JobScheduler
            val componentName = ComponentName(this,
                MyJobService::class.java)
            val builder = JobInfo.Builder(123, componentName)
            builder.setMinimumLatency(8000) //8sec delay
            builder.setOverrideDeadline(10000) 
            builder.setPersisted(true) // if I want to run it in background than TRUE
            builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            builder.setRequiresCharging(false)
            jobScheduler!!.schedule(builder.build())
        }
        stop.setOnClickListener {
            if (jobScheduler !=null){
                jobScheduler!!.cancel(123)
                jobScheduler=null
                Toast.makeText(this,"Job Cancelled",Toast.LENGTH_LONG).show()
            }
        }
    }

}
