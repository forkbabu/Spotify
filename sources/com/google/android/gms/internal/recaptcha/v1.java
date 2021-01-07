package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class v1 implements Iterator<Object> {
    v1() {
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
