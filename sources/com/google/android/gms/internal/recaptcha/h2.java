package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;

final class h2 implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ f2 b;

    h2(f2 f2Var) {
        this.b = f2Var;
        this.a = f2.c(f2Var).iterator();
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
