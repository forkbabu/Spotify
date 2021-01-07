package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.r;
import io.reactivex.v;
import io.reactivex.x;

public final class d0<T> extends a<T, r<T>> {

    static final class a<T> implements x<T>, b {
        final x<? super r<T>> a;
        b b;

        a(x<? super r<T>> xVar) {
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
            this.a.onNext(r.a());
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.onNext(r.b(th));
            this.a.onComplete();
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.a.onNext(r.c(t));
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public d0(v<T> vVar) {
        super(vVar);
    }

    @Override // io.reactivex.s
    public void H0(x<? super r<T>> xVar) {
        this.a.subscribe(new a(xVar));
    }
}
