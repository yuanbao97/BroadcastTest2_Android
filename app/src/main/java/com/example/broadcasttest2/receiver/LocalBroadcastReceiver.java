package com.example.broadcasttest2.receiver;

import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.widget.Toast;

public class LocalBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "LocalBroadcastReceiver", Toast.LENGTH_SHORT).show();
    }
}