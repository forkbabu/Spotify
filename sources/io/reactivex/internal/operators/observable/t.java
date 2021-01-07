package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.a;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.s;
import io.reactivex.x;
import java.util.concurrent.Callable;

public final class t<T> extends s<T> implements Callable<T> {
    final Callable<? extends T> a;

    public t(Callable<? extends T> callable) {
        this.a = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.observers.DeferredScalarDisposable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(xVar);
        xVar.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.d()) {
            try {
                Object call = this.a.call();
                a.c(call, "Callable returned null");
                deferredScalarDisposable.b(call);
            } catch (Throwable th) {
                yif.V(th);
                if (!deferredScalarDisposable.d()) {
                    xVar.onError(th);
                } else {
                    io.reactivex.plugins.a.g(th);
                }
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        T t = (T) this.a.call();
        a.c(t, "The callable returned a null value");
        return t;
    }
}
