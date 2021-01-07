package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.z;

public final class l<T> extends z<T> {
    final T a;

    public l(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        b0Var.onSubscribe(EmptyDisposable.INSTANCE);
        b0Var.onSuccess(this.a);
    }
}
