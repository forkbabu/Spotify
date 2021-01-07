package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Callable;

public final class n<T> extends g<T> implements Callable<T> {
    final Callable<? extends T> c;

    public n(Callable<? extends T> callable) {
        this.c = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        T t = (T) this.c.call();
        a.c(t, "The callable returned a null value");
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.subscriptions.DeferredScalarSubscription */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(upf);
        upf.onSubscribe(deferredScalarSubscription);
        try {
            Object call = this.c.call();
            a.c(call, "The callable returned a null value");
            deferredScalarSubscription.a(call);
        } catch (Throwable th) {
            yif.V(th);
            if (deferredScalarSubscription.get() == 4) {
                io.reactivex.plugins.a.g(th);
            } else {
                upf.onError(th);
            }
        }
    }
}
