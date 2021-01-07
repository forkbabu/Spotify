package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;

public final class d<T> extends l<T> {
    final d0<T> a;
    final n<? super T> b;

    static final class a<T> implements b0<T>, b {
        final io.reactivex.n<? super T> a;
        final n<? super T> b;
        b c;

        a(io.reactivex.n<? super T> nVar, n<? super T> nVar2) {
            this.a = nVar;
            this.b = nVar2;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            b bVar = this.c;
            this.c = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            try {
                if (this.b.test(t)) {
                    this.a.onSuccess(t);
                } else {
                    this.a.onComplete();
                }
            } catch (Throwable th) {
                yif.V(th);
                this.a.onError(th);
            }
        }
    }

    public d(d0<T> d0Var, n<? super T> nVar) {
        this.a = d0Var;
        this.b = nVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(io.reactivex.n<? super T> nVar) {
        this.a.subscribe(new a(nVar, this.b));
    }
}
