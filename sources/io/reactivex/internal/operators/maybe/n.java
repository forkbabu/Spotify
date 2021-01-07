package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;

public final class n<T> extends a<T, T> {
    final io.reactivex.functions.n<? super Throwable> b;

    static final class a<T> implements io.reactivex.n<T>, b {
        final io.reactivex.n<? super T> a;
        final io.reactivex.functions.n<? super Throwable> b;
        b c;

        a(io.reactivex.n<? super T> nVar, io.reactivex.functions.n<? super Throwable> nVar2) {
            this.a = nVar;
            this.b = nVar2;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            try {
                if (this.b.test(th)) {
                    this.a.onComplete();
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                yif.V(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }
    }

    public n(p<T> pVar, io.reactivex.functions.n<? super Throwable> nVar) {
        super(pVar);
        this.b = nVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(io.reactivex.n<? super T> nVar) {
        this.a.subscribe(new a(nVar, this.b));
    }
}
