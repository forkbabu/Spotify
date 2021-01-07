package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;

public class h0 extends BroadcastReceiver {
    private final a a;

    interface a {
    }

    public h0(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int i = extras.getInt("android.bluetooth.adapter.extra.STATE", -1);
            if (i == 13 || i == 10) {
                Logger.b("onReceive: %s, state: TurningOff/StateOff", action);
                AppProtocolBluetoothService appProtocolBluetoothService = (AppProtocolBluetoothService) this.a;
                appProtocolBluetoothService.getClass();
                Logger.g("onBluetoothStateOff", new Object[0]);
                appProtocolBluetoothService.stopSelf();
            }
        }
    }
}
