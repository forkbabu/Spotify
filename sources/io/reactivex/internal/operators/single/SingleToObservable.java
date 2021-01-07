package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.s;
import io.reactivex.x;

public final class SingleToObservable<T> extends s<T> {
    final d0<? extends T> a;

    static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements b0<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        b upstream;

        SingleToObservableObserver(x<? super T> xVar) {
            super(xVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            c(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            b(t);
        }
    }

    public SingleToObservable(d0<? extends T> d0Var) {
        this.a = d0Var;
    }

    public static <T> b0<T> g1(x<? super T> xVar) {
        return new SingleToObservableObserver(xVar);
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new SingleToObservableObserver(xVar));
    }
}
