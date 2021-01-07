package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class p1 {
    private static final p1 c = new p1();
    private final s1 a = new u0();
    private final ConcurrentMap<Class<?>, q1<?>> b = new ConcurrentHashMap();

    private p1() {
    }

    public static p1 a() {
        return c;
    }

    public final <T> q1<T> b(Class<T> cls) {
        Charset charset = i0.a;
        if (cls != null) {
            q1<T> q1Var = (q1<T>) this.b.get(cls);
            if (q1Var != null) {
                return q1Var;
            }
            q1<T> a2 = ((u0) this.a).a(cls);
            q1<T> q1Var2 = (q1<T>) this.b.putIfAbsent(cls, a2);
            return q1Var2 != null ? q1Var2 : a2;
        }
        throw new NullPointerException("messageType");
    }

    public final <T> q1<T> c(T t) {
        return b(t.getClass());
    }
}
