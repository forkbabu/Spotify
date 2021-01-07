package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class y4 implements Iterator {
    private int a = 0;
    private final int b;
    private final /* synthetic */ zzlb c;

    y4(zzlb zzlb) {
        this.c = zzlb;
        this.b = zzlb.size();
    }

    public final byte a() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.f(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
