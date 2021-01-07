package com.google.android.gms.internal.cast;

final class zzfh extends zzeu<Object> {
    private final transient Object[] f;
    private final transient int n;

    zzfh(Object[] objArr, int i) {
        this.f = objArr;
        this.n = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        s.i(i, 0);
        return this.f[(i * 2) + this.n];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
