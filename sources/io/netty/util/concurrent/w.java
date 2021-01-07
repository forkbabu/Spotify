package io.netty.util.concurrent;

import io.netty.channel.n0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class w extends b {
    private final l[] a;
    private final Set<l> b;
    private final AtomicInteger c = new AtomicInteger();
    private final y<?> f = new i(t.w);
    private final m n;

    protected w(int i, Executor executor, Object... objArr) {
        m mVar;
        int i2 = 0;
        boolean z = true;
        if (i > 0) {
            executor = executor == null ? new i0(new k(k.a(((n0) this).getClass()), false, 10, System.getSecurityManager() == null ? Thread.currentThread().getThreadGroup() : System.getSecurityManager().getThreadGroup())) : executor;
            this.a = new l[i];
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    this.a[i3] = f(executor, objArr);
                } catch (Exception e) {
                    throw new IllegalStateException("failed to create a child event loop", e);
                } catch (Throwable th) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.a[i4].C0();
                    }
                    while (i2 < i3) {
                        l lVar = this.a[i2];
                        while (!lVar.isTerminated()) {
                            try {
                                lVar.awaitTermination(2147483647L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw th;
                            }
                        }
                        i2++;
                    }
                    throw th;
                }
            }
            l[] lVarArr = this.a;
            int length = lVarArr.length;
            if (((-length) & length) != length ? false : z) {
                mVar = new g(lVarArr);
            } else {
                mVar = new f(lVarArr);
            }
            this.n = mVar;
            v vVar = new v(this);
            l[] lVarArr2 = this.a;
            int length2 = lVarArr2.length;
            while (i2 < length2) {
                lVarArr2[i2].D().mo86d(vVar);
                i2++;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.a.length);
            Collections.addAll(linkedHashSet, this.a);
            this.b = Collections.unmodifiableSet(linkedHashSet);
            return;
        }
        throw new IllegalArgumentException(String.format("nThreads: %d (expected: > 0)", Integer.valueOf(i)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanoTime;
        long nanos = timeUnit.toNanos(j) + System.nanoTime();
        l[] lVarArr = this.a;
        loop0:
        for (l lVar : lVarArr) {
            do {
                nanoTime = nanos - System.nanoTime();
                if (nanoTime <= 0) {
                    break loop0;
                }
            } while (!lVar.awaitTermination(nanoTime, TimeUnit.NANOSECONDS));
        }
        return isTerminated();
    }

    /* access modifiers changed from: protected */
    public abstract l f(Executor executor, Object... objArr);

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        for (l lVar : this.a) {
            if (!lVar.isShutdown()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        for (l lVar : this.a) {
            if (!lVar.isTerminated()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.b.iterator();
    }

    @Override // io.netty.util.concurrent.n
    public l next() {
        return this.n.next();
    }

    @Override // io.netty.util.concurrent.b, io.netty.util.concurrent.n
    @Deprecated
    public void shutdown() {
        for (l lVar : this.a) {
            lVar.shutdown();
        }
    }
}
