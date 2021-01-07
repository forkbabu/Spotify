package io.netty.channel;

import io.netty.util.concurrent.c0;
import io.netty.util.concurrent.g0;
import io.netty.util.concurrent.l;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.s;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class u0 extends g0 implements i0 {
    protected static final int H = Math.max(16, s.c("io.netty.eventLoop.maxPendingTasks", Integer.MAX_VALUE));
    private final Queue<Runnable> G;

    interface a extends Runnable {
    }

    protected u0(j0 j0Var, Executor executor, boolean z, int i, c0 c0Var) {
        super(j0Var, executor, z, i, c0Var);
        this.G = PlatformDependent.T(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public boolean J() {
        return super.J() || !this.G.isEmpty();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public boolean S(Runnable runnable) {
        return !(runnable instanceof a);
    }

    @Override // io.netty.util.concurrent.a, io.netty.util.concurrent.n
    public l next() {
        return this;
    }

    @Override // io.netty.channel.j0
    public g q1(d dVar) {
        d0 d0Var = new d0(dVar, this);
        d0Var.h().l0().C(this, d0Var);
        return d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public void y() {
        P(this.G);
    }
}
