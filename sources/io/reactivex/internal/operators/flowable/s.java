package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.fuseable.h;
import io.reactivex.internal.subscriptions.ScalarSubscription;

public final class s<T> extends g<T> implements h<T> {
    private final T c;

    public s(T t) {
        this.c = t;
    }

    @Override // io.reactivex.internal.fuseable.h, java.util.concurrent.Callable
    public T call() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        upf.onSubscribe(new ScalarSubscription(upf, this.c));
    }
}
