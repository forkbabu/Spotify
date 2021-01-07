package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

public final class l<T> extends g<T> {
    final Callable<? extends Throwable> c;

    public l(Callable<? extends Throwable> callable) {
        this.c = callable;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        Throwable th;
        try {
            Object call = this.c.call();
            a.c(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th2) {
            th = th2;
            yif.V(th);
        }
        upf.onSubscribe(EmptySubscription.INSTANCE);
        upf.onError(th);
    }
}
