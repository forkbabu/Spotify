package io.reactivex.internal.operators.completable;

import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.d0;
import io.reactivex.disposables.b;

public final class i<T> extends io.reactivex.a {
    final d0<T> a;

    static final class a<T> implements b0<T> {
        final c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.a.onComplete();
        }
    }

    public i(d0<T> d0Var) {
        this.a = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new a(cVar));
    }
}
