package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.z;

public final class h<T> extends z<T> {
    final d0<T> a;
    final g<? super T> b;

    final class a implements b0<T> {
        final b0<? super T> a;

        a(b0<? super T> b0Var) {
            this.a = b0Var;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            try {
                h.this.b.accept(t);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                yif.V(th);
                this.a.onError(th);
            }
        }
    }

    public h(d0<T> d0Var, g<? super T> gVar) {
        this.a = d0Var;
        this.b = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var));
    }
}
