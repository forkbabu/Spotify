package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class e3 {
    private static final Class<?> a;
    private static final boolean b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        b = cls2 != null;
    }

    static boolean a() {
        return a != null && !b;
    }

    static Class<?> b() {
        return a;
    }
}
