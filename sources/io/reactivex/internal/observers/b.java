package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.e;

public abstract class b<T> implements e<T> {
    @Override // io.reactivex.internal.fuseable.j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
