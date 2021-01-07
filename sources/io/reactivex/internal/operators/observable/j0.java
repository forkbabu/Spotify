package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;

public final class j0<T> extends a<T, T> {
    final c<T, T, T> b;

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        final c<T, T, T> b;
        b c;
        T f;
        boolean n;

        a(x<? super T> xVar, c<T, T, T> cVar) {
            this.a = xVar;
            this.b = cVar;
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
            if (!this.n) {
                this.n = true;
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.n) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.n = true;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.n) {
                x<? super T> xVar = this.a;
                T t2 = this.f;
                if (t2 == null) {
                    this.f = t;
                    xVar.onNext(t);
                    return;
                }
                try {
                    T a2 = this.b.a(t2, t);
                    io.reactivex.internal.functions.a.c(a2, "The value returned by the accumulator is null");
                    this.f = a2;
                    xVar.onNext(a2);
                } catch (Throwable th) {
                    yif.V(th);
                    this.c.dispose();
                    onError(th);
                }
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

    public j0(v<T> vVar, c<T, T, T> cVar) {
        super(vVar);
        this.b = cVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
