package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.z;

public final class m<T, R> extends z<R> {
    final d0<? extends T> a;
    final l<? super T, ? extends R> b;

    static final class a<T, R> implements b0<T> {
        final b0<? super R> a;
        final l<? super T, ? extends R> b;

        a(b0<? super R> b0Var, l<? super T, ? extends R> lVar) {
            this.a = b0Var;
            this.b = lVar;
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
                Object apply = this.b.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper function returned a null value.");
                this.a.onSuccess(apply);
            } catch (Throwable th) {
                yif.V(th);
                this.a.onError(th);
            }
        }
    }

    public m(d0<? extends T> d0Var, l<? super T, ? extends R> lVar) {
        this.a = d0Var;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super R> b0Var) {
        this.a.subscribe(new a(b0Var, this.b));
    }
}
