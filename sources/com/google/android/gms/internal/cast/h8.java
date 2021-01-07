package com.google.android.gms.internal.cast;

import java.util.Iterator;

final class h8 implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ e8 b;

    h8(e8 e8Var) {
        this.b = e8Var;
        this.a = e8Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
