package io.netty.util.concurrent;

import io.netty.util.concurrent.b0;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public final class f0<V> extends b0<V> implements e0<V> {
    private static final long A = System.nanoTime();
    private static final AtomicLong z = new AtomicLong();
    private final long w = z.getAndIncrement();
    private long x;
    private final long y;

    f0(d dVar, Runnable runnable, V v, long j) {
        super(dVar, new b0.a(runnable, null));
        this.x = j;
        this.y = 0;
    }

    static long U(long j) {
        return c0() + j;
    }

    static long c0() {
        return System.nanoTime() - A;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.i
    public l F() {
        return super.F();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.b0, io.netty.util.concurrent.i
    public StringBuilder O() {
        StringBuilder O = super.O();
        O.setCharAt(O.length() - 1, ',');
        O.append(" id: ");
        O.append(this.w);
        O.append(", deadline: ");
        O.append(this.x);
        O.append(", period: ");
        O.append(this.y);
        O.append(')');
        return O;
    }

    /* access modifiers changed from: package-private */
    public boolean S(boolean z2) {
        return super.cancel(z2);
    }

    public long T() {
        return this.x;
    }

    public long W() {
        return Math.max(0L, this.x - c0());
    }

    public long b0(long j) {
        return Math.max(0L, this.x - (j - A));
    }

    @Override // io.netty.util.concurrent.i, io.netty.util.concurrent.r, java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        boolean cancel = super.cancel(z2);
        if (cancel) {
            ((d) super.F()).f(this);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (this == delayed) {
            return 0;
        }
        f0 f0Var = (f0) delayed;
        long j = this.x - f0Var.x;
        if (j >= 0) {
            if (j <= 0) {
                long j2 = this.w;
                long j3 = f0Var.w;
                if (j2 >= j3) {
                    if (j2 == j3) {
                        throw new Error();
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(Math.max(0L, this.x - c0()), TimeUnit.NANOSECONDS);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: io.netty.util.concurrent.f0<V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.concurrent.b0, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        try {
            if (this.y == 0) {
                if (k()) {
                    Q(this.v.call());
                }
            } else if (!isCancelled()) {
                this.v.call();
                if (!super.F().isShutdown()) {
                    long j = this.y;
                    if (j > 0) {
                        this.x += j;
                    } else {
                        this.x = c0() - j;
                    }
                    if (!isCancelled()) {
                        ((d) super.F()).f.add(this);
                    }
                }
            }
        } catch (Throwable th) {
            P(th);
        }
    }

    f0(d dVar, Callable<V> callable, long j, long j2) {
        super(dVar, callable);
        if (j2 != 0) {
            this.x = j;
            this.y = j2;
            return;
        }
        throw new IllegalArgumentException("period: 0 (expected: != 0)");
    }

    f0(d dVar, Callable<V> callable, long j) {
        super(dVar, callable);
        this.x = j;
        this.y = 0;
    }
}
