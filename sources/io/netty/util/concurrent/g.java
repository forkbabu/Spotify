package io.netty.util.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class g implements m {
    private final AtomicInteger a = new AtomicInteger();
    private final l[] b;

    g(l[] lVarArr) {
        this.b = lVarArr;
    }

    @Override // io.netty.util.concurrent.m
    public l next() {
        return this.b[this.a.getAndIncrement() & (this.b.length - 1)];
    }
}
