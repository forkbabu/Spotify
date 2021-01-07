package com.google.android.gms.internal.cast;

import java.util.ListIterator;

public abstract class u0<E> extends v0<E> implements ListIterator<E> {
    protected u0() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
