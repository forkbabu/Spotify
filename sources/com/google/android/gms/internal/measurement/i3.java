package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class i3 implements Iterator {
    private int a = 0;
    private final int b;
    private final /* synthetic */ zzgm c;

    i3(zzgm zzgm) {
        this.c = zzgm;
        this.b = zzgm.d();
    }

    public final byte a() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.k(i);
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
