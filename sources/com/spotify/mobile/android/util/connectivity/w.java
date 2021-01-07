package com.spotify.mobile.android.util.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.spotify.base.java.logging.Logger;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class w extends v {
    private final Context c;
    private final TelephonyManager d;
    private final ConnectivityManager e;
    private final PowerManager f;
    private final y g;
    private PhoneStateListener h;
    private final BroadcastReceiver i = new a();
    private final ConnectivityManager.NetworkCallback j = new b();
    private boolean k;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w.this.d();
        }
    }

    class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            w.this.d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            w.this.d();
        }
    }

    class c extends PhoneStateListener {
        c() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDataConnectionStateChanged(int i, int i2) {
            super.onDataConnectionStateChanged(i, i2);
            w.this.d();
        }
    }

    w(Context context, y yVar) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.d = (TelephonyManager) applicationContext.getSystemService("phone");
        this.e = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.f = (PowerManager) applicationContext.getSystemService("power");
        this.g = yVar;
    }

    @Override // com.spotify.mobile.android.util.connectivity.v
    public void b() {
        PhoneStateListener phoneStateListener;
        if (!this.k) {
            Logger.b("Ignoring hang-up request, not listening.", new Object[0]);
            return;
        }
        this.a.clear();
        this.c.unregisterReceiver(this.i);
        TelephonyManager telephonyManager = this.d;
        if (!(telephonyManager == null || (phoneStateListener = this.h) == null)) {
            telephonyManager.listen(phoneStateListener, 0);
        }
        this.e.unregisterNetworkCallback(this.j);
        this.k = false;
    }

    @Override // com.spotify.mobile.android.util.connectivity.v
    public ConnectionType c() {
        ConnectionType connectionType;
        if (this.f.isDeviceIdleMode() && !this.f.isIgnoringBatteryOptimizations(this.c.getPackageName())) {
            Logger.g("Connectivity status: (idle)", new Object[0]);
        }
        ConnectivityManager connectivityManager = this.e;
        if (Build.VERSION.SDK_INT >= 23) {
            connectionType = r.c(connectivityManager);
        } else {
            connectionType = r.d(connectivityManager, null);
        }
        Logger.g("Connectivity status: %s", connectionType.toString());
        return connectionType;
    }

    @Override // com.spotify.mobile.android.util.connectivity.v
    public void d() {
        this.g.b(new a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.connectivity.v
    public void f() {
        if (this.e != null) {
            this.e.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).addCapability(16).build(), this.j);
        }
        if (this.d != null) {
            c cVar = new c();
            this.h = cVar;
            this.d.listen(cVar, 64);
        }
        this.c.registerReceiver(this.i, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
        this.k = true;
    }

    public void h() {
        ConnectionType c2 = c();
        boolean isNetworkRoaming = this.d.isNetworkRoaming();
        synchronized (this.a) {
            for (a0 a0Var : this.a) {
                a0Var.a(c2, isNetworkRoaming);
            }
        }
    }
}
