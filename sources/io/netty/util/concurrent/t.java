package io.netty.util.concurrent;

import io.netty.util.internal.logging.c;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class t extends d {
    private static final io.netty.util.internal.logging.b u = c.b(t.class.getName());
    private static final long v = TimeUnit.SECONDS.toNanos(1);
    public static final t w = new t();
    final BlockingQueue<Runnable> n = new LinkedBlockingQueue();
    final f0<Void> o;
    final ThreadFactory p;
    private final b q;
    private final AtomicBoolean r;
    volatile Thread s;
    private final r<?> t;

    class a implements Runnable {
        a(t tVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable;
            Runnable runnable2;
            while (true) {
                t tVar = t.this;
                BlockingQueue<Runnable> blockingQueue = tVar.n;
                while (true) {
                    Queue<f0<?>> queue = tVar.f;
                    runnable = null;
                    f0<?> peek = queue == null ? null : queue.peek();
                    if (peek != null) {
                        long W = peek.W();
                        if (W > 0) {
                            runnable2 = blockingQueue.poll(W, TimeUnit.NANOSECONDS);
                        } else {
                            runnable2 = blockingQueue.poll();
                        }
                        if (runnable2 == null) {
                            long c0 = f0.c0();
                            for (Runnable e = tVar.e(c0); e != null; e = tVar.e(c0)) {
                                tVar.n.add(e);
                            }
                            runnable2 = blockingQueue.poll();
                        }
                        runnable = runnable2;
                        if (runnable != null) {
                            break;
                        }
                    } else {
                        try {
                            runnable = blockingQueue.take();
                            break;
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        t.u.j("Unexpected exception from the global event executor: ", th);
                    }
                    if (runnable != t.this.o) {
                        continue;
                    }
                }
                t tVar2 = t.this;
                Queue<f0<?>> queue2 = tVar2.f;
                if (tVar2.n.isEmpty() && (queue2 == null || queue2.size() == 1)) {
                    t.this.r.compareAndSet(true, false);
                    if ((t.this.n.isEmpty() && (queue2 == null || queue2.size() == 1)) || !t.this.r.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }
    }

    static {
        int i = c.b;
    }

    private t() {
        Callable callable = Executors.callable(new a(this), null);
        long j = v;
        f0<Void> f0Var = new f0<>(this, callable, f0.U(j), -j);
        this.o = f0Var;
        this.p = new k(k.a(t.class), false, 5, null);
        this.q = new b();
        this.r = new AtomicBoolean();
        this.t = new o(this, new UnsupportedOperationException());
        i().add(f0Var);
    }

    @Override // io.netty.util.concurrent.l
    public boolean A1(Thread thread) {
        return thread == this.s;
    }

    @Override // io.netty.util.concurrent.n
    public r<?> D() {
        return this.t;
    }

    @Override // io.netty.util.concurrent.n
    public r<?> Y0(long j, long j2, TimeUnit timeUnit) {
        return this.t;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    @Override // io.netty.util.concurrent.n
    public boolean c1() {
        return false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            this.n.add(runnable);
            if (!G() && this.r.compareAndSet(false, true)) {
                Thread newThread = this.p.newThread(this.q);
                this.s = newThread;
                newThread.start();
                return;
            }
            return;
        }
        throw new NullPointerException("task");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // io.netty.util.concurrent.a, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    @Deprecated
    public void shutdown() {
        throw new UnsupportedOperationException();
    }
}
