package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class zzfa<E> extends zzeu<E> {
    static final zzeu<Object> o = new zzfa(new Object[0], 0);
    private final transient Object[] f;
    private final transient int n;

    zzfa(Object[] objArr, int i) {
        this.f = objArr;
        this.n = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzeu, com.google.android.gms.internal.cast.zzet
    public final int c(Object[] objArr, int i) {
        System.arraycopy(this.f, 0, objArr, i, this.n);
        return i + this.n;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final Object[] e() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        s.i(i, this.n);
        return (E) this.f[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final int h() {
        return this.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
