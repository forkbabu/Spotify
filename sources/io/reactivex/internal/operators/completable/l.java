package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.n;

public final class l extends io.reactivex.a {
    final e a;
    final n<? super Throwable> b;

    final class a implements c {
        private final c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            try {
                if (l.this.b.test(th)) {
                    this.a.onComplete();
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                yif.V(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }
    }

    public l(e eVar, n<? super Throwable> nVar) {
        this.a = eVar;
        this.b = nVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new a(cVar));
    }
}
