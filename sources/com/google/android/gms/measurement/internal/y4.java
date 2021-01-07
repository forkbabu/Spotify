package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class y4 extends b6 {
    private static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    private b5 c;
    private b5 d;
    private final PriorityBlockingQueue<c5<?>> e = new PriorityBlockingQueue<>();
    private final BlockingQueue<c5<?>> f = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler g = new a5(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler h = new a5(this, "Thread death: Uncaught exception on network thread");
    private final Object i = new Object();
    private final Semaphore j = new Semaphore(2);

    y4(f5 f5Var) {
        super(f5Var);
    }

    private final void x(c5<?> c5Var) {
        synchronized (this.i) {
            this.e.add(c5Var);
            b5 b5Var = this.c;
            if (b5Var == null) {
                b5 b5Var2 = new b5(this, "Measurement Worker", this.e);
                this.c = b5Var2;
                b5Var2.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                b5Var.a();
            }
        }
    }

    public final <V> Future<V> A(Callable<V> callable) {
        n();
        c5<?> c5Var = new c5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            c5Var.run();
        } else {
            x(c5Var);
        }
        return c5Var;
    }

    public final void B(Runnable runnable) {
        n();
        x(new c5<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final void D(Runnable runnable) {
        n();
        c5<?> c5Var = new c5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(c5Var);
            b5 b5Var = this.d;
            if (b5Var == null) {
                b5 b5Var2 = new b5(this, "Measurement Network", this.f);
                this.d = b5Var2;
                b5Var2.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                b5Var.a();
            }
        }
    }

    public final boolean G() {
        return Thread.currentThread() == this.c;
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void a() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void b() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final <T> T u(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            super.k().y(runnable);
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                super.l().H().a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            super.l().H().a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> v(Callable<V> callable) {
        n();
        c5<?> c5Var = new c5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                super.l().H().a("Callable skipped the worker queue.");
            }
            c5Var.run();
        } else {
            x(c5Var);
        }
        return c5Var;
    }

    public final void y(Runnable runnable) {
        n();
        if (runnable != null) {
            x(new c5<>(this, runnable, false, "Task exception on worker thread"));
            return;
        }
        throw new NullPointerException("null reference");
    }
}
