package io.netty.util.concurrent;

import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public abstract class a extends AbstractExecutorService implements l {
    private static final b c = c.b(a.class.getName());
    private final n a;
    private final Collection<l> b = Collections.singleton(this);

    static {
        int i = c.b;
    }

    protected a() {
    }

    protected static void c(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            c.g("A task raised an exception. Task: {}", runnable, th);
        }
    }

    @Override // io.netty.util.concurrent.n
    public r<?> C0() {
        return Y0(2, 15, TimeUnit.SECONDS);
    }

    @Override // io.netty.util.concurrent.l
    public boolean G() {
        return A1(Thread.currentThread());
    }

    @Override // io.netty.util.concurrent.l
    public <V> r<V> W(V v) {
        return new h0(this, v);
    }

    @Override // io.netty.util.concurrent.l
    public <V> r<V> X0(Throwable th) {
        return new o(this, th);
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.b.iterator();
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new b0(this, runnable, t);
    }

    @Override // io.netty.util.concurrent.n
    public l next() {
        return this;
    }

    @Override // io.netty.util.concurrent.l
    public <V> y<V> q() {
        return new i(this);
    }

    @Override // java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    @Deprecated
    public abstract void shutdown();

    @Override // java.util.concurrent.ExecutorService
    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit */
    public r<?> mo90submit(Runnable runnable) {
        return (r) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new b0(this, callable);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit  reason: collision with other method in class */
    public Future mo90submit(Runnable runnable) {
        return (r) super.submit(runnable);
    }

    protected a(n nVar) {
        this.a = nVar;
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit */
    public <T> r<T> mo91submit(Runnable runnable, T t) {
        return (r) super.submit(runnable, (Runnable) t);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    /* renamed from: schedule */
    public <V> e0<V> mo93schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit  reason: collision with other method in class */
    public Future mo91submit(Runnable runnable, Object obj) {
        return (r) super.submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit */
    public <T> r<T> mo92submit(Callable<T> callable) {
        return (r) super.submit((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit  reason: collision with other method in class */
    public Future mo92submit(Callable callable) {
        return (r) super.submit(callable);
    }
}
