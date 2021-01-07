package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.z;

public final class d<T> extends z<T> {
    final d0<T> a;
    final io.reactivex.functions.a b;

    static final class a<T> implements b0<T>, b {
        final b0<? super T> a;
        final io.reactivex.functions.a b;
        b c;

        a(b0<? super T> b0Var, io.reactivex.functions.a aVar) {
            this.a = b0Var;
            this.b = aVar;
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
            try {
                this.b.run();
            } catch (Throwable th2) {
                yif.V(th2);
                io.reactivex.plugins.a.g(th2);
            }
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
                this.b.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
        }
    }

    public d(d0<T> d0Var, io.reactivex.functions.a aVar) {
        this.a = d0Var;
        this.b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var, this.b));
    }
}
