package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;

public final class p0<T> extends a<T, T> {
    final n<? super T> b;

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        final n<? super T> b;
        b c;
        boolean f;

        a(x<? super T> xVar, n<? super T> nVar) {
            this.a = xVar;
            this.b = nVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
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
            if (this.f) {
                this.a.onNext(t);
                return;
            }
            try {
                if (!this.b.test(t)) {
                    this.f = true;
                    this.a.onNext(t);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.c.dispose();
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public p0(v<T> vVar, n<? super T> nVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
