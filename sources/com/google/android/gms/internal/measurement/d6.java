package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class d6 implements Iterator<Object> {
    d6() {
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
