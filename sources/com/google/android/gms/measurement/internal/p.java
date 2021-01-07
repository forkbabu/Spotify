package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class p implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ m b;

    p(m mVar) {
        this.b = mVar;
        this.a = mVar.a.keySet().iterator();
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
        throw new UnsupportedOperationException("Remove not supported");
    }
}
