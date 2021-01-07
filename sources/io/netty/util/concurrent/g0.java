package io.netty.util.concurrent;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class g0 extends d implements x {
    private static final io.netty.util.internal.logging.b C = c.b(g0.class.getName());
    private static final Runnable D = new a();
    private static final AtomicIntegerFieldUpdater<g0> E;
    private static final long F = TimeUnit.SECONDS.toNanos(1);
    private long A;
    private final y<?> B = new i(t.w);
    private final Queue<Runnable> n;
    private volatile Thread o;
    private volatile j0 p;
    private final Executor q;
    private final Semaphore r = new Semaphore(0);
    private final Set<Runnable> s = new LinkedHashSet();
    private final boolean t;
    private final int u;
    private final c0 v;
    private long w;
    private volatile int x = 1;
    private volatile long y;
    private volatile long z;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 214
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
            // Method dump skipped, instructions count: 1067
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.concurrent.g0.b.run():void");
        }
    }

    static {
        Math.max(16, s.c("io.netty.eventexecutor.maxPendingTasks", Integer.MAX_VALUE));
        AtomicIntegerFieldUpdater<g0> M = PlatformDependent.M(g0.class, "state");
        if (M == null) {
            M = AtomicIntegerFieldUpdater.newUpdater(g0.class, "x");
        }
        E = M;
        if (PlatformDependent.O(g0.class, "threadProperties") == null) {
            AtomicReferenceFieldUpdater.newUpdater(g0.class, j0.class, "p");
        }
    }

    protected g0(n nVar, Executor executor, boolean z2, int i, c0 c0Var) {
        super(nVar);
        this.t = z2;
        int max = Math.max(16, i);
        this.u = max;
        if (executor != null) {
            this.q = executor;
            this.n = PlatformDependent.T(max);
            if (c0Var != null) {
                this.v = c0Var;
                return;
            }
            throw new NullPointerException("rejectedHandler");
        }
        throw new NullPointerException("executor");
    }

    private void H() {
        this.q.execute(new b());
    }

    private boolean I() {
        long c0 = f0.c0();
        Runnable e = e(c0);
        while (e != null) {
            if (!this.n.offer(e)) {
                i().add((f0) e);
                return false;
            }
            e = e(c0);
        }
        return true;
    }

    private void Q(String str) {
        if (G()) {
            throw new RejectedExecutionException(je.y0("Calling ", str, " from within the EventLoop is not allowed"));
        }
    }

    /* access modifiers changed from: protected */
    public boolean A() {
        if (!c1()) {
            return false;
        }
        if (G()) {
            Queue<f0<?>> queue = this.f;
            if (!(queue == null || queue.isEmpty())) {
                for (f0 f0Var : (f0[]) queue.toArray(new f0[queue.size()])) {
                    f0Var.S(false);
                }
                queue.clear();
            }
            if (this.A == 0) {
                this.A = f0.c0();
            }
            if (!N()) {
                boolean z2 = false;
                while (!this.s.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.s);
                    this.s.clear();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            try {
                                ((Runnable) it.next()).run();
                            } catch (Throwable th) {
                                C.j("Shutdown hook raised an exception.", th);
                            }
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    this.w = f0.c0();
                }
                if (!z2) {
                    long c0 = f0.c0();
                    if (isShutdown() || c0 - this.A > this.z || c0 - this.w > this.y) {
                        return true;
                    }
                    T(true);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                    return false;
                }
            }
            if (isShutdown() || this.y == 0) {
                return true;
            }
            T(true);
            return false;
        }
        throw new IllegalStateException("must be invoked from an event loop");
    }

    @Override // io.netty.util.concurrent.l
    public boolean A1(Thread thread) {
        return thread == this.o;
    }

    @Override // io.netty.util.concurrent.n
    public r<?> D() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public long E(long j) {
        f0<?> f0Var;
        Queue<f0<?>> queue = this.f;
        if (queue == null) {
            f0Var = null;
        } else {
            f0Var = queue.peek();
        }
        if (f0Var == null) {
            return F;
        }
        return f0Var.b0(j);
    }

    /* access modifiers changed from: protected */
    public boolean J() {
        return !this.n.isEmpty();
    }

    /* access modifiers changed from: protected */
    public Runnable K() {
        return L(this.n);
    }

    /* access modifiers changed from: protected */
    public final Runnable L(Queue<Runnable> queue) {
        Runnable poll;
        do {
            poll = queue.poll();
        } while (poll == D);
        return poll;
    }

    /* access modifiers changed from: protected */
    public abstract void M();

    /* access modifiers changed from: protected */
    public boolean N() {
        boolean I;
        boolean z2 = false;
        do {
            I = I();
            if (P(this.n)) {
                z2 = true;
                continue;
            }
        } while (!I);
        if (z2) {
            this.w = f0.c0();
        }
        y();
        return z2;
    }

    /* access modifiers changed from: protected */
    public boolean O(long j) {
        long j2;
        I();
        Runnable K = K();
        if (K == null) {
            y();
            return false;
        }
        long c0 = f0.c0() + j;
        long j3 = 0;
        while (true) {
            a.c(K);
            j3++;
            if ((63 & j3) == 0) {
                j2 = f0.c0();
                if (j2 >= c0) {
                    break;
                }
            }
            K = K();
            if (K == null) {
                j2 = f0.c0();
                break;
            }
        }
        y();
        this.w = j2;
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean P(Queue<Runnable> queue) {
        Runnable L = L(queue);
        if (L == null) {
            return false;
        }
        do {
            a.c(L);
            L = L(queue);
        } while (L != null);
        return true;
    }

    /* access modifiers changed from: protected */
    public void R() {
        this.w = f0.c0();
    }

    /* access modifiers changed from: protected */
    public boolean S(Runnable runnable) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void T(boolean z2) {
        if (!z2 || E.get(this) == 3) {
            this.n.offer(D);
        }
    }

    @Override // io.netty.util.concurrent.n
    public r<?> Y0(long j, long j2, TimeUnit timeUnit) {
        boolean z2;
        if (j < 0) {
            throw new IllegalArgumentException("quietPeriod: " + j + " (expected >= 0)");
        } else if (j2 < j) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout: ");
            sb.append(j2);
            sb.append(" (expected >= quietPeriod (");
            throw new IllegalArgumentException(je.E0(sb, j, "))"));
        } else if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (c1()) {
            return this.B;
        } else {
            boolean G = G();
            while (!c1()) {
                AtomicIntegerFieldUpdater<g0> atomicIntegerFieldUpdater = E;
                int i = atomicIntegerFieldUpdater.get(this);
                int i2 = 3;
                if (G || i == 1 || i == 2) {
                    z2 = true;
                } else {
                    i2 = i;
                    z2 = false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                    this.y = timeUnit.toNanos(j);
                    this.z = timeUnit.toNanos(j2);
                    if (i == 1) {
                        H();
                    }
                    if (z2) {
                        T(G);
                    }
                    return this.B;
                }
            }
            return this.B;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (!G()) {
            if (this.r.tryAcquire(j, timeUnit)) {
                this.r.release();
            }
            return isTerminated();
        } else {
            throw new IllegalStateException("cannot await termination of the current thread");
        }
    }

    @Override // io.netty.util.concurrent.n
    public boolean c1() {
        return E.get(this) >= 3;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            boolean G = G();
            if (G) {
                x(runnable);
            } else {
                AtomicIntegerFieldUpdater<g0> atomicIntegerFieldUpdater = E;
                if (atomicIntegerFieldUpdater.get(this) == 1 && atomicIntegerFieldUpdater.compareAndSet(this, 1, 2)) {
                    H();
                }
                x(runnable);
                if (isShutdown() && this.n.remove(runnable)) {
                    throw new RejectedExecutionException("event executor terminated");
                }
            }
            if (!this.t && S(runnable)) {
                T(G);
                return;
            }
            return;
        }
        throw new NullPointerException("task");
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        Q("invokeAll");
        return super.invokeAll(collection);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        Q("invokeAny");
        return (T) super.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return E.get(this) >= 4;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return E.get(this) == 5;
    }

    @Override // io.netty.util.concurrent.a, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    @Deprecated
    public void shutdown() {
        boolean z2;
        if (!isShutdown()) {
            boolean G = G();
            while (!c1()) {
                AtomicIntegerFieldUpdater<g0> atomicIntegerFieldUpdater = E;
                int i = atomicIntegerFieldUpdater.get(this);
                int i2 = 4;
                if (G || i == 1 || i == 2 || i == 3) {
                    z2 = true;
                } else {
                    i2 = i;
                    z2 = false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                    if (i == 1) {
                        H();
                    }
                    if (z2) {
                        T(G);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x(Runnable runnable) {
        if (isShutdown()) {
            throw new RejectedExecutionException("event executor terminated");
        } else if (!this.n.offer(runnable)) {
            this.v.a(runnable, this);
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    /* access modifiers changed from: protected */
    public void z() {
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        Q("invokeAll");
        return super.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        Q("invokeAny");
        return (T) super.invokeAny(collection, j, timeUnit);
    }
}
