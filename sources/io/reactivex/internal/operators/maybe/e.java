package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;

public final class e<T> extends l<T> implements Callable<T> {
    final Callable<? extends T> a;

    public e(Callable<? extends T> callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return (T) this.a.call();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        b a2 = c.a();
        nVar.onSubscribe(a2);
        if (!a2.d()) {
            try {
                Object obj = (Object) this.a.call();
                if (a2.d()) {
                    return;
                }
                if (obj == 0) {
                    nVar.onComplete();
                } else {
                    nVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                yif.V(th);
                if (!a2.d()) {
                    nVar.onError(th);
                } else {
                    a.g(th);
                }
            }
        }
    }
}
