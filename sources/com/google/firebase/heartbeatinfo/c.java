package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;

/* access modifiers changed from: package-private */
public class c {
    private static c b;
    private final SharedPreferences a;

    private c(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (b == null) {
                b = new c(context);
            }
            cVar = b;
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(String str, long j) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
