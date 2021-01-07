package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.n;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCallbackObserver<T> extends AtomicReference<b> implements n<T>, b, io.reactivex.observers.b {
    private static final long serialVersionUID = -6076952298809384986L;
    final a onComplete;
    final g<? super Throwable> onError;
    final g<? super T> onSuccess;

    public MaybeCallbackObserver(g<? super T> gVar, g<? super Throwable> gVar2, a aVar) {
        this.onSuccess = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return DisposableHelper.h((b) get());
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.g(this);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        return this.onError != Functions.e;
    }

    @Override // io.reactivex.n
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            yif.V(th);
            io.reactivex.plugins.a.g(th);
        }
    }

    @Override // io.reactivex.n
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            yif.V(th2);
            io.reactivex.plugins.a.g(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.n
    public void onSubscribe(b bVar) {
        DisposableHelper.l(this, bVar);
    }

    @Override // io.reactivex.n
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            yif.V(th);
            io.reactivex.plugins.a.g(th);
        }
    }
}
