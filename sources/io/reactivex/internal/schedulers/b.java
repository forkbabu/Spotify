package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class b implements Future<Object> {
    final io.reactivex.disposables.b a;

    b(io.reactivex.disposables.b bVar) {
        this.a = bVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
