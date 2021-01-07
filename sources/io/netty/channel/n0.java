package io.netty.channel;

import io.netty.util.concurrent.l;
import io.netty.util.concurrent.w;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.s;
import java.util.concurrent.Executor;

public abstract class n0 extends w implements j0 {
    private static final b o;
    private static final int p;

    static {
        int i = c.b;
        b b = c.b(n0.class.getName());
        o = b;
        int max = Math.max(1, s.c("io.netty.eventLoopThreads", Runtime.getRuntime().availableProcessors() * 2));
        p = max;
        if (b.c()) {
            b.r("-Dio.netty.eventLoopThreads: {}", Integer.valueOf(max));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected n0(int i, Executor executor, Object... objArr) {
        super(i == 0 ? p : i, executor, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract i0 f(Executor executor, Object... objArr);

    @Override // io.netty.util.concurrent.w, io.netty.util.concurrent.n
    public l next() {
        return (i0) super.next();
    }

    @Override // io.netty.channel.j0
    public g q1(d dVar) {
        return ((i0) super.next()).q1(dVar);
    }
}
