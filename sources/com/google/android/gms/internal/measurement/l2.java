package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Map;

public final class l2 implements s1 {
    private static final Map<String, l2> e = new m1();
    private final SharedPreferences a;
    private final SharedPreferences.OnSharedPreferenceChangeListener b;
    private final Object c;
    private volatile Map<String, ?> d;

    static l2 a(Context context) {
        l2 l2Var;
        if (!m1.a()) {
            synchronized (l2.class) {
                l2Var = (l2) ((t1) e).get(null);
                if (l2Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return l2Var;
        }
        throw null;
    }

    static synchronized void b() {
        Map<String, l2> map = e;
        synchronized (l2.class) {
            for (l2 l2Var : ((m1) map).values()) {
                l2Var.a.unregisterOnSharedPreferenceChangeListener(l2Var.b);
            }
            ((t1) map).clear();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.internal.measurement.s1
    public final Object d(String str) {
        Map<String, ?> map = this.d;
        if (map == null) {
            synchronized (this.c) {
                map = this.d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
