package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.z;
import java.util.NoSuchElementException;

public final class q<T> extends z<T> {
    final p<T> a;
    final T b = null;

    static final class a<T> implements n<T>, b {
        final b0<? super T> a;
        final T b;
        b c;

        a(b0<? super T> b0Var, T t) {
            this.a = b0Var;
            this.b = t;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
            this.c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.c = DisposableHelper.DISPOSED;
            T t = this.b;
            if (t != null) {
                this.a.onSuccess(t);
            } else {
                this.a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.c = DisposableHelper.DISPOSED;
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
            this.c = DisposableHelper.DISPOSED;
            this.a.onSuccess(t);
        }
    }

    public q(p<T> pVar, T t) {
        this.a = pVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var, this.b));
    }
}
