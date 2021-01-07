package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.c;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.p;

public final class h<T> extends io.reactivex.a implements c<T> {
    final p<T> a;

    static final class a<T> implements n<T>, b {
        final io.reactivex.c a;
        b b;

        a(io.reactivex.c cVar) {
            this.a = cVar;
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

    public h(p<T> pVar) {
        this.a = pVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(io.reactivex.c cVar) {
        this.a.subscribe(new a(cVar));
    }

    @Override // io.reactivex.internal.fuseable.c
    public l<T> b() {
        return new g(this.a);
    }
}
