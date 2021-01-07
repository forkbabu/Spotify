package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.q0;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class r0 implements Runnable {
    private final long a;
    private final PowerManager.WakeLock b;
    private final FirebaseInstanceId c;

    static class a extends BroadcastReceiver {
        private r0 a;

        public a(r0 r0Var) {
            this.a = r0Var;
        }

        public void a() {
            FirebaseInstanceId.p();
            this.a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            r0 r0Var = this.a;
            if (r0Var != null && r0Var.d()) {
                FirebaseInstanceId.p();
                this.a.c.f(this.a, 0);
                this.a.b().unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    r0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.c = firebaseInstanceId;
        this.a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private void c(String str) {
        if ("[DEFAULT]".equals(this.c.h().i())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(this.c.h().i());
                if (valueOf.length() != 0) {
                    "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    new String("Invoking onNewToken for app: ");
                }
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            Context b2 = b();
            Intent intent2 = new Intent(b2, FirebaseInstanceIdReceiver.class);
            intent2.setAction("com.google.firebase.MESSAGING_EVENT");
            intent2.putExtra("wrapped_intent", intent);
            b2.sendBroadcast(intent2);
        }
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.c.h().g();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        q0.a o = this.c.o();
        boolean z = true;
        if (!this.c.B(o)) {
            return true;
        }
        try {
            String d = this.c.d();
            if (d == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            if (o == null || !d.equals(o.a)) {
                c(d);
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String.valueOf(e.getMessage()).length();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (p0.a().d(b())) {
            this.b.acquire();
        }
        try {
            this.c.x(true);
            if (!this.c.r()) {
                this.c.x(false);
                if (p0.a().d(b())) {
                    this.b.release();
                }
            } else if (!p0.a().c(b()) || d()) {
                if (e()) {
                    this.c.x(false);
                } else {
                    this.c.A(this.a);
                }
                if (p0.a().d(b())) {
                    this.b.release();
                }
            } else {
                new a(this).a();
                if (p0.a().d(b())) {
                    this.b.release();
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.c.x(false);
            if (p0.a().d(b())) {
                this.b.release();
            }
        } catch (Throwable th) {
            if (p0.a().d(b())) {
                this.b.release();
            }
            throw th;
        }
    }
}
