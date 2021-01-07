package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

public final class c<T> extends g<T> {
    final Callable<? extends tpf<? extends T>> c;

    public c(Callable<? extends tpf<? extends T>> callable) {
        this.c = callable;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        try {
            Object call = this.c.call();
            a.c(call, "The publisher supplied is null");
            ((tpf) call).subscribe(upf);
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
