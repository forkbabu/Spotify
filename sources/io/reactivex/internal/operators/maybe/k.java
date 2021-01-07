package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.h;
import io.reactivex.l;
import io.reactivex.n;

public final class k<T> extends l<T> implements h<T> {
    final T a;

    public k(T t) {
        this.a = t;
    }

    @Override // io.reactivex.internal.fuseable.h, java.util.concurrent.Callable
    public T call() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        nVar.onSubscribe(EmptyDisposable.INSTANCE);
        nVar.onSuccess(this.a);
    }
}
