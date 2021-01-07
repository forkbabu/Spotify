package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;
import java.util.NoSuchElementException;

public final class l<T> extends a<T, T> {
    final long b;
    final T c;
    final boolean f;

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        final long b;
        final T c;
        final boolean f;
        b n;
        long o;
        boolean p;

        a(x<? super T> xVar, long j, T t, boolean z) {
            this.a = xVar;
            this.b = j;
            this.c = t;
            this.f = z;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.n.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.n.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.p) {
                this.p = true;
                T t = this.c;
                if (t != null || !this.f) {
                    if (t != null) {
                        this.a.onNext(t);
                    }
                    this.a.onComplete();
                    return;
                }
                this.a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.p) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.p = true;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.p) {
                long j = this.o;
                if (j == this.b) {
                    this.p = true;
                    this.n.dispose();
                    this.a.onNext(t);
                    this.a.onComplete();
                    return;
                }
                this.o = j + 1;
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.n, bVar)) {
                this.n = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public l(v<T> vVar, long j, T t, boolean z) {
        super(vVar);
        this.b = j;
        this.c = t;
        this.f = z;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b, this.c, this.f));
    }
}
