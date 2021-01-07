package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.v;
import io.reactivex.x;

public final class r0<T> extends a<T, T> {
    final long b;

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        boolean b;
        b c;
        long f;

        a(x<? super T> xVar, long j) {
            this.a = xVar;
            this.f = j;
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
            if (!this.b) {
                this.b = true;
                this.c.dispose();
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.b) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.b = true;
            this.c.dispose();
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.b) {
                long j = this.f;
                long j2 = j - 1;
                this.f = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                if (this.f == 0) {
                    this.b = true;
                    bVar.dispose();
                    EmptyDisposable.h(this.a);
                    return;
                }
                this.a.onSubscribe(this);
            }
        }
    }

    public r0(v<T> vVar, long j) {
        super(vVar);
        this.b = j;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
