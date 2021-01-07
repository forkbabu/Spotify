package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.z;

public final class c<T> extends z<T> {
    final d0<T> a;
    final g<? super T> b;

    static final class a<T> implements b0<T>, b {
        final b0<? super T> a;
        final g<? super T> b;
        b c;

        a(b0<? super T> b0Var, g<? super T> gVar) {
            this.a = b0Var;
            this.b = gVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
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
            this.a.onSuccess(t);
            try {
                this.b.accept(t);
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
        }
    }

    public c(d0<T> d0Var, g<? super T> gVar) {
        this.a = d0Var;
        this.b = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var, this.b));
    }
}
