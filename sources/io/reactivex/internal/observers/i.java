package io.reactivex.internal.observers;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class i<T> implements b0<T> {
    final AtomicReference<b> a;
    final b0<? super T> b;

    public i(AtomicReference<b> atomicReference, b0<? super T> b0Var) {
        this.a = atomicReference;
        this.b = b0Var;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        DisposableHelper.i(this.a, bVar);
    }

    @Override // io.reactivex.b0
    public void onSuccess(T t) {
        this.b.onSuccess(t);
    }
}
