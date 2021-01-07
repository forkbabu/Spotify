package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.z;

public final class o<T> extends z<T> {
    final d0<? extends T> a;
    final l<? super Throwable, ? extends T> b;
    final T c;

    final class a implements b0<T> {
        private final b0<? super T> a;

        a(b0<? super T> b0Var) {
            this.a = b0Var;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            T t;
            o oVar = o.this;
            l<? super Throwable, ? extends T> lVar = oVar.b;
            if (lVar != null) {
                try {
                    t = (Object) lVar.apply(th);
                } catch (Throwable th2) {
                    yif.V(th2);
                    this.a.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = oVar.c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.a.onError(nullPointerException);
                return;
            }
            this.a.onSuccess(t);
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

    public o(d0<? extends T> d0Var, l<? super Throwable, ? extends T> lVar, T t) {
        this.a = d0Var;
        this.b = lVar;
        this.c = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var));
    }
}
