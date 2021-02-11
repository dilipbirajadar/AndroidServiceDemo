package com.dilip.servicedemo

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {

    private val TAG = "ServiceDemo"

    override fun onHandleIntent(arg0: Intent?) {
        Log.e(TAG, "Intent Service started")
    }
}