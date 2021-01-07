package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.v;
import io.reactivex.x;

public final class l0<T> extends l<T> {
    final v<T> a;

    static final class a<T> implements x<T>, b {
        final n<? super T> a;
        b b;
        T c;
        boolean f;

        a(n<? super T> nVar) {
            this.a = nVar;
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
            if (!this.f) {
                this.f = true;
                T t = this.c;
                this.c = null;
                if (t == null) {
                    this.a.onComplete();
                } else {
                    this.a.onSuccess(t);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.f) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.f = true;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.f) {
                if (this.c != null) {
                    this.f = true;
                    this.b.dispose();
                    this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.c = t;
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public l0(v<T> vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new a(nVar));
    }
}
