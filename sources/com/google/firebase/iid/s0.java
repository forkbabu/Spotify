package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

public final class s0 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    private static rv c;

    public static void a(Intent intent) {
        synchronized (b) {
            if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                c.b();
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (b) {
            if (c == null) {
                rv rvVar = new rv(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                c = rvVar;
                rvVar.c(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                c.a(a);
            }
            return startService;
        }
    }
}
