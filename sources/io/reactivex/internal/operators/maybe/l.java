package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;

public final class l<T, R> extends a<T, R> {
    final io.reactivex.functions.l<? super T, ? extends R> b;

    static final class a<T, R> implements n<T>, b {
        final n<? super R> a;
        final io.reactivex.functions.l<? super T, ? extends R> b;
        b c;

        a(n<? super R> nVar, io.reactivex.functions.l<? super T, ? extends R> lVar) {
            this.a = nVar;
            this.b = lVar;
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
                Object apply = this.b.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null item");
                this.a.onSuccess(apply);
            } catch (Throwable th) {
                yif.V(th);
                this.a.onError(th);
            }
        }
    }

    public l(p<T> pVar, io.reactivex.functions.l<? super T, ? extends R> lVar) {
        super(pVar);
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super R> nVar) {
        this.a.subscribe(new a(nVar, this.b));
    }
}
