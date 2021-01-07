package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.s;
import io.reactivex.x;

public final class MaybeToObservable<T> extends s<T> {
    final p<T> a;

    static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements n<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        b upstream;

        MaybeToObservableObserver(x<? super T> xVar) {
            super(xVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.n
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            c(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            b(t);
        }
    }

    public MaybeToObservable(p<T> pVar) {
        this.a = pVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new MaybeToObservableObserver(xVar));
    }
}
