package com.spotify.mobile.android.util.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* access modifiers changed from: package-private */
public class x extends v {
    private static final Set<x> i = new CopyOnWriteArraySet();
    private final TelephonyManager c;
    private final ConnectivityManager d;
    private final Context e;
    private boolean f;
    private final BroadcastReceiver g = new a();
    private PhoneStateListener h;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            x.this.d();
        }
    }

    class b extends PhoneStateListener {
        b() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDataConnectionStateChanged(int i, int i2) {
            super.onDataConnectionStateChanged(i, i2);
            x.this.d();
        }
    }

    x(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.c = (TelephonyManager) applicationContext.getSystemService("phone");
        this.d = (ConnectivityManager) applicationContext.getSystemService("connectivity");
    }

    @Override // com.spotify.mobile.android.util.connectivity.v
    public void b() {
        PhoneStateListener phoneStateListener;
        synchronized (this) {
            if (!this.f) {
                Logger.b("Ignoring hang-up request, not listening.", new Object[0]);
                return;
            }
            i.remove(this);
            this.a.clear();
            try {
                this.e.unregisterReceiver(this.g);
            } catch (IllegalArgumentException e2) {
                Assertion.i("Should have been registered", e2);
            }
            TelephonyManager telephonyManager = this.c;
            if (!(telephonyManager == null || (phoneStateListener = this.h) == null)) {
                telephonyManager.listen(phoneStateListener, 0);
            }
            this.f = false;
        }
    }

    @Override // com.spotify.mobile.android.util.connectivity.v
    public ConnectionType c() {
        ConnectivityManager connectivityManager = this.d;
        TelephonyManager telephonyManager = this.c;
        if (Build.VERSION.SDK_INT >= 23) {
            return r.c(connectivityManager);
        }
        return r.d(connectivityManager, telephonyManager);
    }

    @Override // com.spotify.mobile.android.util.connectivity.v
    public void d() {
        ConnectionType c2 = c();
        boolean isNetworkRoaming = this.c.isNetworkRoaming();
        synchronized (this.a) {
            for (a0 a0Var : this.a) {
                a0Var.a(c2, isNetworkRoaming);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.connectivity.v
    public void f() {
        if (this.f) {
            Logger.b("Ignoring listen request, already listening.", new Object[0]);
            return;
        }
        this.e.registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        if (this.c != null) {
            b bVar = new b();
            this.h = bVar;
            this.c.listen(bVar, 64);
        }
        this.f = true;
        i.add(this);
    }
}
