package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.d;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;

public final class m<T> extends l<T> implements d<T> {
    final v<T> a;
    final long b;

    static final class a<T> implements x<T>, b {
        final n<? super T> a;
        final long b;
        b c;
        long f;
        boolean n;

        a(n<? super T> nVar, long j) {
            this.a = nVar;
            this.b = j;
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
                long j = this.f;
                if (j == this.b) {
                    this.n = true;
                    this.c.dispose();
                    this.a.onSuccess(t);
                    return;
                }
                this.f = j + 1;
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

    public m(v<T> vVar, long j) {
        this.a = vVar;
        this.b = j;
    }

    @Override // io.reactivex.internal.fuseable.d
    public s<T> a() {
        return new l(this.a, this.b, null, false);
    }

    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new a(nVar, this.b));
    }
}
