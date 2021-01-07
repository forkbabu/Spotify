package io.reactivex.internal.observers;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class ConsumerSingleObserver<T> extends AtomicReference<b> implements b0<T>, b, io.reactivex.observers.b {
    private static final long serialVersionUID = -7012088219455310787L;
    final g<? super Throwable> onError;
    final g<? super T> onSuccess;

    public ConsumerSingleObserver(g<? super T> gVar, g<? super Throwable> gVar2) {
        this.onSuccess = gVar;
        this.onError = gVar2;
    }

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
        return this.onError != Functions.e;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            yif.V(th2);
            a.g(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        DisposableHelper.l(this, bVar);
    }

    @Override // io.reactivex.b0
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            yif.V(th);
            a.g(th);
        }
    }
}
