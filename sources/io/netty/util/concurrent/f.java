package io.netty.util.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class f implements m {
    private final AtomicInteger a = new AtomicInteger();
    private final l[] b;

    f(l[] lVarArr) {
        this.b = lVarArr;
    }

    @Override // io.netty.util.concurrent.m
    public l next() {
        return this.b[Math.abs(this.a.getAndIncrement() % this.b.length)];
    }
}
