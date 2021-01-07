package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.b;
import io.reactivex.z;

public final class f<T> extends z<T> {
    final d0<T> a;
    final b<? super T, ? super Throwable> b;

    final class a implements b0<T> {
        private final b0<? super T> a;

        a(b0<? super T> b0Var) {
            this.a = b0Var;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            try {
                f.this.b.a(null, th);
            } catch (Throwable th2) {
                yif.V(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.a.onSubscribe(bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            try {
                f.this.b.a(t, null);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                yif.V(th);
                this.a.onError(th);
            }
        }
    }

    public f(d0<T> d0Var, b<? super T, ? super Throwable> bVar) {
        this.a = d0Var;
        this.b = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var));
    }
}
