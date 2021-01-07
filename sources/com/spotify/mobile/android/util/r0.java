package com.spotify.mobile.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.util.SensorRecorder;

public class r0 implements b {
    private final Context a;
    private final SensorRecorder b;
    private final BroadcastReceiver c = new a();
    private ConnectivityManager f;
    private boolean n;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            r0.b(r0.this);
        }
    }

    r0(Context context, SensorRecorder sensorRecorder) {
        this.a = context;
        this.b = sensorRecorder;
    }

    static void b(r0 r0Var) {
        NetworkInfo activeNetworkInfo = r0Var.f.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            if (!r0Var.n) {
                r0Var.n = true;
                r0Var.b.f("wifi_connected", SensorRecorder.RecordingPurpose.TRAINING, 10000);
            }
        } else if (r0Var.n) {
            r0Var.b.g();
            r0Var.n = false;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.f = (ConnectivityManager) this.a.getSystemService("connectivity");
        this.a.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.unregisterReceiver(this.c);
        if (this.n) {
            this.b.g();
            this.n = false;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "WifiConnectedSensorRecorder";
    }
}
