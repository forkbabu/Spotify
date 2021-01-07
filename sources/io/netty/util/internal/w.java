package io.netty.util.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class w<T> extends AtomicLongFieldUpdater<T> {
    private final long a;
    private final Unsafe b;

    w(Unsafe unsafe, Class<? super T> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (Modifier.isVolatile(declaredField.getModifiers())) {
            this.b = unsafe;
            this.a = unsafe.objectFieldOffset(declaredField);
            return;
        }
        throw new IllegalArgumentException("Must be volatile");
    }

    @Override // java.util.concurrent.atomic.AtomicLongFieldUpdater
    public boolean compareAndSet(T t, long j, long j2) {
        return this.b.compareAndSwapLong(t, this.a, j, j2);
    }

    @Override // java.util.concurrent.atomic.AtomicLongFieldUpdater
    public long get(T t) {
        return this.b.getLongVolatile(t, this.a);
    }

    @Override // java.util.concurrent.atomic.AtomicLongFieldUpdater
    public void lazySet(T t, long j) {
        this.b.putOrderedLong(t, this.a, j);
    }

    @Override // java.util.concurrent.atomic.AtomicLongFieldUpdater
    public void set(T t, long j) {
        this.b.putLongVolatile(t, this.a, j);
    }

    @Override // java.util.concurrent.atomic.AtomicLongFieldUpdater
    public boolean weakCompareAndSet(T t, long j, long j2) {
        return this.b.compareAndSwapLong(t, this.a, j, j2);
    }
}
