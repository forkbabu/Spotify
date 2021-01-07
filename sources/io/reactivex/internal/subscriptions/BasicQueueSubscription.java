package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.g;
import java.util.concurrent.atomic.AtomicLong;

public abstract class BasicQueueSubscription<T> extends AtomicLong implements g<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // io.reactivex.internal.fuseable.j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
