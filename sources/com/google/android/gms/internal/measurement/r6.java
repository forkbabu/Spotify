package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class r6 implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ p6 b;

    r6(p6 p6Var) {
        this.b = p6Var;
        this.a = p6Var.a.iterator();
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
