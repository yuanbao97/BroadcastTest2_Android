package com.example.broadcasttest2;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.example.broadcasttest2.receiver.LocalBroadcastReceiver;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sendLocalBroadcastButton)
    Button sendLocalBroadcastButton;
    private LocalBroadcastReceiver localBroadcastReceiver;
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        localBroadcastReceiver = new LocalBroadcastReceiver();
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        localBroadcastManager.registerReceiver(localBroadcastReceiver, new IntentFilter("com.example.broadcasttest2.receiver.LocalBroadcastReceiver"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        localBroadcastManager.unregisterReceiver(localBroadcastReceiver);
    }

    @OnClick(R.id.sendLocalBroadcastButton)
    public void onClick() {
        Intent intent = new Intent("com.example.broadcasttest2.receiver.LocalBroadcastReceiver");
        localBroadcastManager.sendBroadcast(intent);
    }

}