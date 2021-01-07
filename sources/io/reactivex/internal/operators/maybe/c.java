package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.functions.n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;

public final class c<T> extends a<T, T> {
    final n<? super T> b;

    static final class a<T> implements io.reactivex.n<T>, b {
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

        @Override // io.reactivex.n
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.a.onError(th);
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

    public c(p<T> pVar, n<? super T> nVar) {
        super(pVar);
        this.b = nVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(io.reactivex.n<? super T> nVar) {
        this.a.subscribe(new a(nVar, this.b));
    }
}
