package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.comscore.streaming.WindowState;
import java.util.ArrayDeque;
import java.util.Queue;

public class p0 {
    private static p0 e;
    private String a = null;
    private Boolean b = null;
    private Boolean c = null;
    private final Queue<Intent> d = new ArrayDeque();

    private p0() {
    }

    public static synchronized p0 a() {
        p0 p0Var;
        synchronized (p0.class) {
            if (e == null) {
                e = new p0();
            }
            p0Var = e;
        }
        return p0Var;
    }

    public Intent b() {
        return this.d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.b.booleanValue();
    }

    public int e(Context context, Intent intent) {
        String str;
        ComponentName componentName;
        ServiceInfo serviceInfo;
        String str2;
        Log.isLoggable("FirebaseInstanceId", 3);
        this.d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (this) {
            str = this.a;
            if (str == null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
                    Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                    String str3 = serviceInfo.packageName;
                    String str4 = serviceInfo.name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                    sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                    sb.append(str3);
                    sb.append("/");
                    sb.append(str4);
                    Log.e("FirebaseInstanceId", sb.toString());
                } else {
                    if (str2.startsWith(".")) {
                        String valueOf = String.valueOf(context.getPackageName());
                        String valueOf2 = String.valueOf(serviceInfo.name);
                        this.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    } else {
                        this.a = serviceInfo.name;
                    }
                    str = this.a;
                }
                str = null;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                if (str.length() != 0) {
                    "Restricting intent to a specific service: ".concat(str);
                } else {
                    new String("Restricting intent to a specific service: ");
                }
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (d(context)) {
                componentName = s0.b(context, intent2);
            } else {
                componentName = context.startService(intent2);
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
            return WindowState.FULL_SCREEN;
        } catch (IllegalStateException e3) {
            String valueOf3 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf3);
            Log.e("FirebaseInstanceId", sb2.toString());
            return WindowState.MINIMIZED;
        }
    }
}
