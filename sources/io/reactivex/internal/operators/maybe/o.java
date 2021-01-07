package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;

public final class o<T> extends a<T, T> {
    final l<? super Throwable, ? extends T> b;

    static final class a<T> implements n<T>, b {
        final n<? super T> a;
        final l<? super Throwable, ? extends T> b;
        b c;

        a(n<? super T> nVar, l<? super Throwable, ? extends T> lVar) {
            this.a = nVar;
            this.b = lVar;
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
                Object apply = this.b.apply(th);
                io.reactivex.internal.functions.a.c(apply, "The valueSupplier returned a null value");
                this.a.onSuccess(apply);
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

    public o(p<T> pVar, l<? super Throwable, ? extends T> lVar) {
        super(pVar);
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new a(nVar, this.b));
    }
}
