package io.reactivex.internal.disposables;

import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.internal.fuseable.e;
import io.reactivex.x;

public enum EmptyDisposable implements e<Object> {
    INSTANCE,
    NEVER;

    public static void h(x<?> xVar) {
        xVar.onSubscribe(INSTANCE);
        xVar.onComplete();
    }

    public static void i(Throwable th, c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public static void k(Throwable th, x<?> xVar) {
        xVar.onSubscribe(INSTANCE);
        xVar.onError(th);
    }

    public static void l(Throwable th, b0<?> b0Var) {
        b0Var.onSubscribe(INSTANCE);
        b0Var.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this == INSTANCE;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }

    @Override // io.reactivex.internal.fuseable.f
    public int g(int i) {
        return i & 2;
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.j
    public Object poll() {
        return null;
    }
}
