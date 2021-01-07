package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;

public final class g<T> extends a<T, T> {

    static final class a<T> implements n<T>, b {
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

        @Override // io.reactivex.n
        public void onComplete() {
            this.b = DisposableHelper.DISPOSED;
            this.a.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.b = DisposableHelper.DISPOSED;
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
            this.b = DisposableHelper.DISPOSED;
            this.a.onComplete();
        }
    }

    public g(p<T> pVar) {
        super(pVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new a(nVar));
    }
}
