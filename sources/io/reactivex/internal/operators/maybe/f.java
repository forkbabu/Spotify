package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;

public final class f<T> extends l<T> {
    final d0<T> a;

    static final class a<T> implements b0<T>, b {
        final n<? super T> a;
        b b;

        a(n<? super T> nVar) {
            this.a = nVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.dispose();
            this.b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.b = DisposableHelper.DISPOSED;
            this.a.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.b = DisposableHelper.DISPOSED;
            this.a.onSuccess(t);
        }
    }

    public f(d0<T> d0Var) {
        this.a = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new a(nVar));
    }
}
