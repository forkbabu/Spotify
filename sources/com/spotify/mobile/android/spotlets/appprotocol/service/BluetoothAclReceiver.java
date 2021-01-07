package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import dagger.android.a;
import dagger.android.d;

public class BluetoothAclReceiver extends d {
    f0 a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a.c(this, context);
        String action = intent.getAction();
        boolean equals = "android.bluetooth.device.action.ACL_CONNECTED".equals(action);
        boolean equals2 = "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        Logger.g("onReceive device: %s, connect: %s, disconnect: %s", bluetoothDevice, Boolean.valueOf(equals), Boolean.valueOf(equals2));
        if ((equals || equals2) && bluetoothDevice != null && bluetoothDevice.getName() != null) {
            this.a.c(context, equals, bluetoothDevice, goAsync());
        }
    }
}
