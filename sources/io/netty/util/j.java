package io.netty.util;

import io.netty.util.i;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class j<T extends i<T>> {
    private final ConcurrentMap<String, T> a = PlatformDependent.P();
    private AtomicInteger b = new AtomicInteger(1);

    /* access modifiers changed from: protected */
    public abstract T a(int i, String str);

    public T b(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        } else if (!str.isEmpty()) {
            T t = this.a.get(str);
            if (t != null) {
                return t;
            }
            T a2 = a(this.b.getAndIncrement(), str);
            T putIfAbsent = this.a.putIfAbsent(str, a2);
            return putIfAbsent == null ? a2 : putIfAbsent;
        } else {
            throw new IllegalArgumentException("empty name");
        }
    }
}
