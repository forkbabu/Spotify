package io.netty.util.concurrent;

import io.netty.channel.n0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class b implements n {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        ((n0) this).next().execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return ((n0) this).next().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) ((n0) this).next().invokeAny(collection);
    }

    @Override // io.netty.util.concurrent.n
    @Deprecated
    public abstract void shutdown();

    @Override // java.util.concurrent.ExecutorService
    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ExecutorService
    /* renamed from: submit */
    public r<?> mo90submit(Runnable runnable) {
        return ((n0) this).next().mo90submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return ((n0) this).next().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) ((n0) this).next().invokeAny(collection, j, timeUnit);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((n0) this).next().schedule(runnable, j, timeUnit);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((n0) this).next().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    public e0<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((n0) this).next().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ExecutorService
    /* renamed from: submit  reason: collision with other method in class */
    public Future mo94submit(Runnable runnable) {
        return ((n0) this).next().mo90submit(runnable);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    /* renamed from: schedule */
    public <V> e0<V> mo93schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return ((n0) this).next().mo93schedule((Callable) callable, j, timeUnit);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ExecutorService
    /* renamed from: submit */
    public <T> r<T> mo91submit(Runnable runnable, T t) {
        return ((n0) this).next().mo91submit(runnable, (Runnable) t);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ScheduledExecutorService
    /* renamed from: schedule  reason: collision with other method in class */
    public ScheduledFuture mo93schedule(Callable callable, long j, TimeUnit timeUnit) {
        return ((n0) this).next().mo93schedule(callable, j, timeUnit);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ExecutorService
    /* renamed from: submit  reason: collision with other method in class */
    public Future mo95submit(Runnable runnable, Object obj) {
        return ((n0) this).next().mo91submit(runnable, (Runnable) obj);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ExecutorService
    /* renamed from: submit */
    public <T> r<T> mo92submit(Callable<T> callable) {
        return ((n0) this).next().mo92submit((Callable) callable);
    }

    @Override // io.netty.util.concurrent.n, java.util.concurrent.ExecutorService
    /* renamed from: submit  reason: collision with other method in class */
    public Future mo96submit(Callable callable) {
        return ((n0) this).next().mo92submit(callable);
    }
}
