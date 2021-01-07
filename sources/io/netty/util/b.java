package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class b implements o {
    private static final AtomicIntegerFieldUpdater<b> a;
    private volatile int refCnt = 1;

    static {
        AtomicIntegerFieldUpdater<b> M = PlatformDependent.M(b.class, "refCnt");
        if (M == null) {
            M = AtomicIntegerFieldUpdater.newUpdater(b.class, "refCnt");
        }
        a = M;
    }

    private boolean c(int i) {
        int i2;
        do {
            i2 = this.refCnt;
            if (i2 < i) {
                throw new IllegalReferenceCountException(i2, -i);
            }
        } while (!a.compareAndSet(this, i2, i2 - i));
        if (i2 != i) {
            return false;
        }
        a();
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public boolean b(int i) {
        if (i > 0) {
            return c(i);
        }
        throw new IllegalArgumentException("decrement: " + i + " (expected: > 0)");
    }

    @Override // io.netty.util.o
    public boolean d() {
        return c(1);
    }

    public o e() {
        int i;
        int i2;
        do {
            i = this.refCnt;
            i2 = i + 1;
            if (i2 <= 1) {
                throw new IllegalReferenceCountException(i, 1);
            }
        } while (!a.compareAndSet(this, i, i2));
        return this;
    }

    @Override // io.netty.util.o
    public final int n() {
        return this.refCnt;
    }
}
