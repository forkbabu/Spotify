package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.fuseable.h;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class k extends g<Object> implements h<Object> {
    public static final g<Object> c = new k();

    private k() {
    }

    @Override // io.reactivex.internal.fuseable.h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super Object> upf) {
        upf.onSubscribe(EmptySubscription.INSTANCE);
        upf.onComplete();
    }
}
