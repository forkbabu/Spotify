package io.reactivex.internal.operators.completable;

import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class q<T> extends z<T> {
    final e a;
    final Callable<? extends T> b;
    final T c;

    final class a implements c {
        private final b0<? super T> a;

        a(b0<? super T> b0Var) {
            this.a = b0Var;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            T t;
            q qVar = q.this;
            Callable<? extends T> callable = qVar.b;
            if (callable != null) {
                try {
                    t = (Object) callable.call();
                } catch (Throwable th) {
                    yif.V(th);
                    this.a.onError(th);
                    return;
                }
            } else {
                t = qVar.c;
            }
            if (t == null) {
                this.a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.a.onSuccess(t);
            }
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }
    }

    public q(e eVar, Callable<? extends T> callable, T t) {
        this.a = eVar;
        this.c = t;
        this.b = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var));
    }
}
