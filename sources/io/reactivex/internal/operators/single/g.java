package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.z;

public final class g<T> extends z<T> {
    final d0<T> a;
    final io.reactivex.functions.g<? super b> b;

    static final class a<T> implements b0<T> {
        final b0<? super T> a;
        final io.reactivex.functions.g<? super b> b;
        boolean c;

        a(b0<? super T> b0Var, io.reactivex.functions.g<? super b> gVar) {
            this.a = b0Var;
            this.b = gVar;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            if (this.c) {
                io.reactivex.plugins.a.g(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            try {
                this.b.accept(bVar);
                this.a.onSubscribe(bVar);
            } catch (Throwable th) {
                yif.V(th);
                this.c = true;
                bVar.dispose();
                EmptyDisposable.l(th, this.a);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            if (!this.c) {
                this.a.onSuccess(t);
            }
        }
    }

    public g(d0<T> d0Var, io.reactivex.functions.g<? super b> gVar) {
        this.a = d0Var;
        this.b = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var, this.b));
    }
}
