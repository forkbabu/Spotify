package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class s7 implements Iterator<Object> {
    s7() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
