package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.z;

public final class j<T> extends z<Boolean> implements Object<T> {
    final p<T> a;

    static final class a<T> implements n<T>, b {
        final b0<? super Boolean> a;
        b b;

        a(b0<? super Boolean> b0Var) {
            this.a = b0Var;
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
            this.a.onSuccess(Boolean.TRUE);
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
            this.a.onSuccess(Boolean.FALSE);
        }
    }

    public j(p<T> pVar) {
        this.a = pVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super Boolean> b0Var) {
        this.a.subscribe(new a(b0Var));
    }

    public l<Boolean> b() {
        return new i(this.a);
    }
}
