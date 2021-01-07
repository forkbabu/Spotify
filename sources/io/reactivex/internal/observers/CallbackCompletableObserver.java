package io.reactivex.internal.observers;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CallbackCompletableObserver extends AtomicReference<b> implements c, b, g<Throwable>, io.reactivex.observers.b {
    private static final long serialVersionUID = -4361286194466301354L;
    final a onComplete;
    final g<? super Throwable> onError;

    public CallbackCompletableObserver(a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        io.reactivex.plugins.a.g(new OnErrorNotImplementedException(th));
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
        return this.onError != this;
    }

    @Override // io.reactivex.c
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            yif.V(th);
            io.reactivex.plugins.a.g(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.c
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            yif.V(th2);
            io.reactivex.plugins.a.g(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.c
    public void onSubscribe(b bVar) {
        DisposableHelper.l(this, bVar);
    }

    public CallbackCompletableObserver(g<? super Throwable> gVar, a aVar) {
        this.onError = gVar;
        this.onComplete = aVar;
    }
}
