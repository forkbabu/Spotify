package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.v;
import io.reactivex.x;

public final class f<T> extends io.reactivex.a {
    final v<T> a;

    static final class a<T> implements x<T> {
        final c a;

        a(c cVar) {
            this.a = cVar;
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
            this.a.onSubscribe(bVar);
        }
    }

    public f(v<T> vVar) {
        this.a = vVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new a(cVar));
    }
}
