package com.spotify.music.features.go.receiver;

import android.app.ActivityManager;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.go.service.GoBluetoothService;
import com.spotify.remoteconfig.x6;
import dagger.android.a;
import dagger.android.d;
import java.util.Iterator;

public class ConnectionStateChangedReceiver extends d {
    h2e a;
    x6 b;

    /* access modifiers changed from: package-private */
    public Intent a(Context context, ae5 ae5, boolean z) {
        int i = GoBluetoothService.r;
        Intent intent = new Intent(context, GoBluetoothService.class);
        intent.putExtra("address", ae5.a());
        intent.putExtra("connected", z);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        ae5 ae5;
        boolean z;
        a.c(this, context);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
            str = "HEADSET";
        } else if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
            str = "A2DP";
        } else {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        boolean z2 = 2 == intExtra;
        boolean z3 = intExtra == 0;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            ae5 = null;
        } else {
            ae5 = new ae5(bluetoothDevice);
        }
        if (z2 != z3 && ae5 != null) {
            Logger.g("Go: Received %s connected: %s", str, Boolean.valueOf(z2));
            if (this.b.d()) {
                String b2 = ae5.b();
                StringBuilder V0 = je.V0("Device: ");
                if (b2 == null) {
                    b2 = "null";
                }
                V0.append(b2);
                V0.append(", signal received by Spotify: ");
                V0.append(z2 ? "connected" : "disconnected");
                Toast.makeText(context, V0.toString(), 0).show();
            }
            if (z2 && ae5.c()) {
                Logger.g("Go: Go device connected: %s", ae5.a());
                this.a.b(context, a(context, ae5, true), "ConnectionStateChangedReceiver", new Object[0]);
            } else if (z3) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningServiceInfo> it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (GoBluetoothService.class.getName().equals(it.next().service.getClassName())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    Logger.g("Go: Possible Go device disconnected: %s", ae5.a());
                    this.a.b(context, a(context, ae5, false), "ConnectionStateChangedReceiver", new Object[0]);
                }
            }
        }
    }
}
