package com.google.android.gms.measurement.internal;

public final class q3<V> {
    private static final Object g = new Object();
    private final String a;
    private final o3<V> b;
    private final V c;
    private final V d;
    private final Object e = new Object();
    private volatile V f = null;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    q3(String str, Object obj, Object obj2, o3 o3Var, p3 p3Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = o3Var;
    }

    public final V a(V v) {
        Object obj = g;
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (g.a == null) {
            return this.c;
        }
        synchronized (obj) {
            if (pa.a()) {
                return this.f == null ? this.c : this.f;
            }
        }
        try {
            for (q3 q3Var : t.b()) {
                if (!pa.a()) {
                    V v2 = null;
                    try {
                        o3<V> o3Var = q3Var.b;
                        if (o3Var != null) {
                            v2 = o3Var.a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (obj) {
                        q3Var.f = v2;
                    }
                } else {
                    throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                }
            }
        } catch (SecurityException unused2) {
        }
        o3<V> o3Var2 = this.b;
        if (o3Var2 == null) {
            return this.c;
        }
        try {
            return o3Var2.a();
        } catch (SecurityException unused3) {
            return this.c;
        } catch (IllegalStateException unused4) {
            return this.c;
        }
    }

    public final String b() {
        return this.a;
    }
}
