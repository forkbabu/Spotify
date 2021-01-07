package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.e0;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class x implements Runnable {
    private static final Object o = new Object();
    private static Boolean p;
    private static Boolean q;
    private final Context a;
    private final e0 b;
    private final PowerManager.WakeLock c;
    private final w f;
    private final long n;

    class a extends BroadcastReceiver {
        private x a;

        public a(x xVar) {
            this.a = xVar;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            x xVar = this.a;
            if (xVar != null) {
                if (xVar.h()) {
                    x.b();
                    this.a.f.d(this.a, 0);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            }
        }
    }

    x(w wVar, Context context, e0 e0Var, long j) {
        this.f = wVar;
        this.a = context;
        this.n = j;
        this.b = e0Var;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static boolean b() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    private static boolean e(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (o) {
            Boolean bool = q;
            if (bool == null) {
                z = f(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean f(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            str.length();
        }
        return z;
    }

    private static boolean g(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (o) {
            Boolean bool = p;
            if (bool == null) {
                z = f(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            p = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized boolean h() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (g(this.a)) {
            this.c.acquire(b.a);
        }
        try {
            this.f.e(true);
            if (!this.b.g()) {
                this.f.e(false);
                if (g(this.a)) {
                    try {
                        this.c.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!e(this.a) || h()) {
                if (this.f.g()) {
                    this.f.e(false);
                } else {
                    this.f.h(this.n);
                }
                if (g(this.a)) {
                    try {
                        this.c.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                a aVar = new a(this);
                b();
                x.this.a.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (g(this.a)) {
                    try {
                        this.c.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.f.e(false);
            if (g(this.a)) {
                try {
                    this.c.release();
                } catch (RuntimeException unused4) {
                }
            }
        } catch (Throwable th) {
            if (g(this.a)) {
                try {
                    this.c.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }
}
