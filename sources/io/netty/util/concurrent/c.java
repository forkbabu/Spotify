package io.netty.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class c<V> implements r<V> {
    @Override // java.util.concurrent.Future
    public V get() {
        u();
        Throwable r = r();
        if (r == null) {
            return s();
        }
        if (r instanceof CancellationException) {
            throw ((CancellationException) r);
        }
        throw new ExecutionException(r);
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        if (i(j, timeUnit)) {
            Throwable r = r();
            if (r == null) {
                return s();
            }
            if (r instanceof CancellationException) {
                throw ((CancellationException) r);
            }
            throw new ExecutionException(r);
        }
        throw new TimeoutException();
    }
}
