package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class x0 implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<a> f = new ArrayDeque();
    private u0 n;
    private boolean o = false;

    /* access modifiers changed from: package-private */
    public static class a {
        final Intent a;
        private final h<Void> b = new h<>();

        a(Intent intent) {
            this.a = intent;
        }

        /* access modifiers changed from: package-private */
        public void a(ScheduledExecutorService scheduledExecutorService) {
            this.b.a().c(scheduledExecutorService, new w0(scheduledExecutorService.schedule(new v0(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.b.e(null);
        }

        /* access modifiers changed from: package-private */
        public g<Void> c() {
            return this.b.a();
        }
    }

    public x0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new tr("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private void a() {
        while (!this.f.isEmpty()) {
            this.f.poll().b();
        }
    }

    private synchronized void b() {
        Log.isLoggable("FirebaseInstanceId", 3);
        while (!this.f.isEmpty()) {
            Log.isLoggable("FirebaseInstanceId", 3);
            u0 u0Var = this.n;
            if (u0Var == null || !u0Var.isBinderAlive()) {
                Log.isLoggable("FirebaseInstanceId", 3);
                if (!this.o) {
                    this.o = true;
                    try {
                        if (!sr.b().a(this.a, this.b, this, 65)) {
                            Log.e("FirebaseInstanceId", "binding to the service failed");
                            this.o = false;
                            a();
                        }
                    } catch (SecurityException e) {
                        Log.e("FirebaseInstanceId", "Exception while binding the service", e);
                    }
                }
                return;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            this.n.a(this.f.poll());
        }
    }

    public synchronized g<Void> c(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseInstanceId", 3);
        aVar = new a(intent);
        aVar.a(this.c);
        this.f.add(aVar);
        b();
        return aVar.c();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(componentName).length();
        }
        this.o = false;
        if (!(iBinder instanceof u0)) {
            String valueOf = String.valueOf(iBinder);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("Invalid service connection: ");
            sb.append(valueOf);
            Log.e("FirebaseInstanceId", sb.toString());
            a();
            return;
        }
        this.n = (u0) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(componentName).length();
        }
        b();
    }
}
