package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import dagger.android.a;
import dagger.android.d;

public class InterAppStartServerReceiver extends d {
    h2e a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a.c(this, context);
        boolean equals = "com.spotify.music.service.bluetooth.action.START_APP_PROTOCOL_SERVER".equals(intent.getAction());
        String stringExtra = intent.getStringExtra("device_name");
        String stringExtra2 = intent.getStringExtra("device_address");
        Logger.g("onReceive start server: %s", Boolean.valueOf(equals));
        if (equals && stringExtra2 != null) {
            this.a.b(context, AppProtocolBluetoothService.g(context, stringExtra2, stringExtra), "InterAppStartServerReceiver", new Object[0]);
        }
    }
}
