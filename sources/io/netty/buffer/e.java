package io.netty.buffer;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class e extends a {
    private static final AtomicIntegerFieldUpdater<e> s;
    private volatile int r = 1;

    static {
        AtomicIntegerFieldUpdater<e> M = PlatformDependent.M(e.class, "refCnt");
        if (M == null) {
            M = AtomicIntegerFieldUpdater.newUpdater(e.class, "r");
        }
        s = M;
    }

    protected e(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public abstract void A2();

    /* access modifiers changed from: protected */
    public final void B2(int i) {
        this.r = i;
    }

    @Override // io.netty.buffer.j
    public j M1(Object obj) {
        return this;
    }

    @Override // io.netty.util.o
    public boolean d() {
        int i;
        do {
            i = this.r;
            if (i < 1) {
                throw new IllegalReferenceCountException(i, -1);
            }
        } while (!s.compareAndSet(this, i, i - 1));
        if (i != 1) {
            return false;
        }
        A2();
        return true;
    }

    @Override // io.netty.util.o
    public int n() {
        return this.r;
    }

    @Override // io.netty.buffer.j
    public j t1() {
        int i;
        int i2;
        do {
            i = this.r;
            i2 = i + 1;
            if (i2 <= 1) {
                throw new IllegalReferenceCountException(i, 1);
            }
        } while (!s.compareAndSet(this, i, i2));
        return this;
    }
}
