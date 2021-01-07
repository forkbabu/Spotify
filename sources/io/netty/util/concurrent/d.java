package io.netty.util.concurrent;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public abstract class d extends a {
    Queue<f0<?>> f;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ f0 a;

        a(f0 f0Var) {
            this.a = f0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.i().add(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ f0 a;

        b(f0 f0Var) {
            this.a = f0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f(this.a);
        }
    }

    protected d() {
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        f0<?> f0Var;
        Queue<f0<?>> queue = this.f;
        if (queue == null) {
            f0Var = null;
        } else {
            f0Var = queue.peek();
        }
        return f0Var != null && f0Var.T() <= f0.c0();
    }

    /* access modifiers changed from: protected */
    public final Runnable e(long j) {
        f0<?> f0Var;
        Queue<f0<?>> queue = this.f;
        if (queue == null) {
            f0Var = null;
        } else {
            f0Var = queue.peek();
        }
        if (f0Var == null || f0Var.T() > j) {
            return null;
        }
        queue.remove();
        return f0Var;
    }

    /* access modifiers changed from: package-private */
    public final void f(f0<?> f0Var) {
        if (G()) {
            i().remove(f0Var);
        } else {
            execute(new b(f0Var));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.netty.util.concurrent.f0<V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public <V> e0<V> h(f0<V> f0Var) {
        if (G()) {
            i().add(f0Var);
        } else {
            execute(new a(f0Var));
        }
        return f0Var;
    }

    /* access modifiers changed from: package-private */
    public Queue<f0<?>> i() {
        if (this.f == null) {
            this.f = new PriorityQueue();
        }
        return this.f;
    }

    protected d(n nVar) {
        super(nVar);
    }

    @Override // io.netty.util.concurrent.a, io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (j < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", Long.valueOf(j)));
        } else if (j2 > 0) {
            f0 f0Var = new f0(this, Executors.callable(runnable, null), f0.U(timeUnit.toNanos(j)), timeUnit.toNanos(j2));
            h(f0Var);
            return f0Var;
        } else {
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", Long.valueOf(j2)));
        }
    }

    @Override // io.netty.util.concurrent.a, io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (j < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", Long.valueOf(j)));
        } else if (j2 > 0) {
            f0 f0Var = new f0(this, Executors.callable(runnable, null), f0.U(timeUnit.toNanos(j)), -timeUnit.toNanos(j2));
            h(f0Var);
            return f0Var;
        } else {
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", Long.valueOf(j2)));
        }
    }

    @Override // io.netty.util.concurrent.a, io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (j >= 0) {
            f0 f0Var = new f0(this, runnable, (Object) null, f0.U(timeUnit.toNanos(j)));
            h(f0Var);
            return f0Var;
        } else {
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", Long.valueOf(j)));
        }
    }

    @Override // io.netty.util.concurrent.a, io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    /* renamed from: schedule */
    public <V> e0<V> mo93schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        if (callable == null) {
            throw new NullPointerException("callable");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit");
        } else if (j >= 0) {
            f0<V> f0Var = new f0<>(this, callable, f0.U(timeUnit.toNanos(j)));
            h(f0Var);
            return f0Var;
        } else {
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", Long.valueOf(j)));
        }
    }
}
