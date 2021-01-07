package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;

public final class x<T> extends a<T, T> {

    static final class a<T> implements io.reactivex.x<T>, b {
        final io.reactivex.x<? super T> a;
        b b;

        a(io.reactivex.x<? super T> xVar) {
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
            this.a.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public x(v<T> vVar) {
        super(vVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(io.reactivex.x<? super T> xVar) {
        this.a.subscribe(new a(xVar));
    }
}
