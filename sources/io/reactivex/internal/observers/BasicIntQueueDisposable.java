package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.e;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements e<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // io.reactivex.internal.fuseable.j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
