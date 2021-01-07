package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class l7 {
    private static final l7 c = new l7();
    private final p7 a = new n6();
    private final ConcurrentMap<Class<?>, m7<?>> b = new ConcurrentHashMap();

    private l7() {
    }

    public static l7 b() {
        return c;
    }

    public final <T> m7<T> a(Class<T> cls) {
        Charset charset = v5.a;
        if (cls != null) {
            m7<T> m7Var = (m7<T>) this.b.get(cls);
            if (m7Var != null) {
                return m7Var;
            }
            m7<T> a2 = ((n6) this.a).a(cls);
            m7<T> m7Var2 = (m7<T>) this.b.putIfAbsent(cls, a2);
            return m7Var2 != null ? m7Var2 : a2;
        }
        throw new NullPointerException("messageType");
    }

    public final <T> m7<T> c(T t) {
        return a(t.getClass());
    }
}
