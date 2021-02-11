package com.dilip.servicedemo

import android.R
import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat


class ServiceDemo: Service() {

    override fun onCreate() {
        super.onCreate()
        Log.e("ServiceDemo: ", "service created")
    }

    override fun onBind(p0: Intent?): IBinder? {
        Log.e("ServiceDemo :", "service binded")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e("ServiceDemo :", "service start command")

        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ServiceDemo :", "service destory")
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
        Log.e("ServiceDemo :", "onRebind")
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.e("ServiceDemo :", "onUnbind")
        return super.onUnbind(intent)

    }
}