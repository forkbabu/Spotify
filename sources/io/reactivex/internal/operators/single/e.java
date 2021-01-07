package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.g;
import io.reactivex.z;

public final class e<T> extends z<T> {
    final d0<T> a;
    final g<? super Throwable> b;

    final class a implements b0<T> {
        private final b0<? super T> a;

        a(b0<? super T> b0Var) {
            this.a = b0Var;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            try {
                e.this.b.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }
    }

    public e(d0<T> d0Var, g<? super Throwable> gVar) {
        this.a = d0Var;
        this.b = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var));
    }
}
