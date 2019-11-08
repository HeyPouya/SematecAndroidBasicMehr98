package com.sematec.sematecandroidbasicmehr98;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Airplane Mode Changed!", Toast.LENGTH_SHORT).show();
    }
}
