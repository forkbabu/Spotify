package io.reactivex.internal.observers;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class BiConsumerSingleObserver<T> extends AtomicReference<b> implements b0<T>, b {
    private static final long serialVersionUID = 4943102778943297569L;
    final io.reactivex.functions.b<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(io.reactivex.functions.b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.g(this);
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.a(null, th);
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
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.a(t, null);
        } catch (Throwable th) {
            yif.V(th);
            a.g(th);
        }
    }
}
