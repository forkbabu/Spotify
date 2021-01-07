package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;

public final class i<T> extends a<T, Boolean> {

    static final class a<T> implements n<T>, b {
        final n<? super Boolean> a;
        b b;

        a(n<? super Boolean> nVar) {
            this.a = nVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.dispose();
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.a.onSuccess(Boolean.FALSE);
        }
    }

    public i(p<T> pVar) {
        super(pVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super Boolean> nVar) {
        this.a.subscribe(new a(nVar));
    }
}
