package io.netty.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface n extends ScheduledExecutorService, Iterable<l> {
    r<?> C0();

    r<?> D();

    r<?> Y0(long j, long j2, TimeUnit timeUnit);

    boolean c1();

    l next();

    @Override // java.util.concurrent.ScheduledExecutorService
    e0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: schedule */
    <V> e0<V> mo93schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    e0<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    e0<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // io.netty.util.concurrent.n
    @Deprecated
    void shutdown();

    @Override // java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit */
    r<?> mo90submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit */
    <T> r<T> mo91submit(Runnable runnable, T t);

    @Override // java.util.concurrent.ExecutorService, io.netty.util.concurrent.n
    /* renamed from: submit */
    <T> r<T> mo92submit(Callable<T> callable);
}
