package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class u extends g<Object> {
    public static final g<Object> c = new u();

    private u() {
    }

    @Override // io.reactivex.g
    public void d0(upf<? super Object> upf) {
        upf.onSubscribe(EmptySubscription.INSTANCE);
    }
}
