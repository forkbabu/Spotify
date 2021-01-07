package io.netty.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public interface r<V> extends Future<V> {
    @Override // java.util.concurrent.Future
    boolean cancel(boolean z);

    @Override // io.netty.util.concurrent.y, io.netty.channel.v, io.netty.channel.g
    /* renamed from: d */
    r<V> mo86d(s<? extends r<? super V>> sVar);

    boolean i(long j, TimeUnit timeUnit);

    Throwable r();

    V s();

    r<V> u();

    boolean x();
}
