package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b2<T> {
    private static final Object g = new Object();
    private static volatile j2 h;
    private static n2 i = new n2(d2.a);
    private static final AtomicInteger j = new AtomicInteger();
    public static final /* synthetic */ int k = 0;
    private final k2 a;
    private final String b;
    private final T c;
    private volatile int d = -1;
    private volatile T e;
    private final boolean f;

    static {
        new AtomicReference();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    b2(k2 k2Var, String str, Object obj, boolean z, g2 g2Var) {
        if (k2Var.a != null) {
            this.a = k2Var;
            this.b = str;
            this.c = obj;
            this.f = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    private final String b(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static void c() {
        j.incrementAndGet();
    }

    @Deprecated
    public static void d(Context context) {
        synchronized (g) {
            j2 j2Var = h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (j2Var == null || j2Var.a() != context) {
                o1.e();
                l2.b();
                w1.b();
                h = new p1(context, o2.k(new e2(context)));
                j.incrementAndGet();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T a(Object obj);

    public final String e() {
        this.a.getClass();
        return b("");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T f() {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b2.f():java.lang.Object");
    }
}
