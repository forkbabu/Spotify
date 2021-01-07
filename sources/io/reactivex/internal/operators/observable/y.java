package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.v;
import io.reactivex.x;

public final class y<T> extends a<T, T> {

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        b b;

        a(x<? super T> xVar) {
            this.a = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            this.b = bVar;
            this.a.onSubscribe(this);
        }
    }

    public y(v<T> vVar) {
        super(vVar);
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar));
    }
}
