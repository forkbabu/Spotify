package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class u5 {
    private static final u5 c = new u5();
    private final a6 a = new z4();
    private final ConcurrentMap<Class<?>, y5<?>> b = new ConcurrentHashMap();

    private u5() {
    }

    public static u5 a() {
        return c;
    }

    public final <T> y5<T> b(Class<T> cls) {
        Charset charset = h4.a;
        if (cls != null) {
            y5<T> y5Var = (y5<T>) this.b.get(cls);
            if (y5Var != null) {
                return y5Var;
            }
            y5<T> a2 = ((z4) this.a).a(cls);
            y5<T> y5Var2 = (y5<T>) this.b.putIfAbsent(cls, a2);
            return y5Var2 != null ? y5Var2 : a2;
        }
        throw new NullPointerException("messageType");
    }

    public final <T> y5<T> c(T t) {
        return b(t.getClass());
    }
}
