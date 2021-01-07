package io.reactivex.internal.observers;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class LambdaObserver<T> extends AtomicReference<b> implements x<T>, b, io.reactivex.observers.b {
    private static final long serialVersionUID = -7251123623727029452L;
    final a onComplete;
    final g<? super Throwable> onError;
    final g<? super T> onNext;
    final g<? super b> onSubscribe;

    public LambdaObserver(g<? super T> gVar, g<? super Throwable> gVar2, a aVar, g<? super b> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
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

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (!d()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (!d()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                io.reactivex.plugins.a.g(new CompositeException(th, th2));
            }
        } else {
            io.reactivex.plugins.a.g(th);
        }
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (!d()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                yif.V(th);
                ((b) get()).dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (DisposableHelper.l(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                yif.V(th);
                bVar.dispose();
                onError(th);
            }
        }
    }
}
