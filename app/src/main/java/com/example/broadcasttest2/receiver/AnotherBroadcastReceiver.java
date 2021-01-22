package com.example.broadcasttest2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getStringExtra("anotherExtra");
        Toast.makeText(context, "AnotherBroadcastReceiver : " + str, Toast.LENGTH_SHORT).show();
    }
}