package io.netty.util.concurrent;

import java.util.concurrent.TimeUnit;

public abstract class e<V> extends c<V> {
    private final l a;

    protected e(l lVar) {
        this.a = lVar;
    }

    @Override // io.netty.util.concurrent.r, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // io.netty.util.concurrent.r, io.netty.util.concurrent.y, io.netty.channel.v, io.netty.channel.g
    /* renamed from: d */
    public r<V> mo86d(s<? extends r<? super V>> sVar) {
        if (sVar != null) {
            i.I(z(), this, sVar);
            return this;
        }
        throw new NullPointerException("listener");
    }

    @Override // io.netty.util.concurrent.r
    public boolean i(long j, TimeUnit timeUnit) {
        if (!Thread.interrupted()) {
            return true;
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // io.netty.util.concurrent.r
    public r<V> u() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    public l z() {
        return this.a;
    }
}
