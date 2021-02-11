package com.dilip.servicedemo
import android.app.Service
import android.content.Intent
import android.content.ServiceConnection
import android.os.Binder
import android.os.IBinder
import android.util.Log
import java.util.*


class BoundServices : Service() {

    // Binder given to clients
    private val binder = LocalBinder()

    // Random number generator
    private val mGenerator = Random()

    /** method for clients  */
    val randomNumber: Int
        get() = mGenerator.nextInt(100)

    /**
     * Class used for the client Binder.  Because we know this service always
     * runs in the same process as its clients, we don't need to deal with IPC.
     */
    inner class LocalBinder : Binder() {
        // Return this instance of LocalService so clients can call public methods

        fun getService(): BoundServices = this@BoundServices
    }

    override fun onBind(p0: Intent?): IBinder? {
        Log.e("BoundService: ", "service bind")
       return binder
    }

    override fun unbindService(conn: ServiceConnection) {
        Log.e("BoundService: ", "service unbind")
        super.unbindService(conn)

    }

    override fun onRebind(intent: Intent?) {
        Log.e("BoundService: ", "service rebind")
        super.onRebind(intent)

    }

}


