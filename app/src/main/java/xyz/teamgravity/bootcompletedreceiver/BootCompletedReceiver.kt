package xyz.teamgravity.bootcompletedreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BootCompletedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_BOOT_COMPLETED) {
            Toast.makeText(context, "Action Boot Completed", Toast.LENGTH_SHORT).show()
        }
    }
}