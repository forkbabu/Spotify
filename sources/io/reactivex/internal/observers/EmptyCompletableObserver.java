package io.reactivex.internal.observers;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class EmptyCompletableObserver extends AtomicReference<b> implements c, b, io.reactivex.observers.b {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.g(this);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.c
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.c
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        a.g(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.c
    public void onSubscribe(b bVar) {
        DisposableHelper.l(this, bVar);
    }
}
