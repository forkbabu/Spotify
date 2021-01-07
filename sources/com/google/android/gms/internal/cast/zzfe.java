package com.google.android.gms.internal.cast;

final class zzfe<K> extends zzfb<K> {
    private final transient zzey<K, ?> c;
    private final transient zzeu<K> f;

    zzfe(zzey<K, ?> zzey, zzeu<K> zzeu) {
        this.c = zzey;
        this.f = zzeu;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final int c(Object[] objArr, int i) {
        return this.f.c(objArr, i);
    }

    @Override // com.google.android.gms.internal.cast.zzet, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        this.c.getClass();
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzet
    /* renamed from: d */
    public final v0<K> iterator() {
        return (v0) this.f.iterator();
    }

    @Override // com.google.android.gms.internal.cast.zzfb
    public final zzeu<K> i() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.c.getClass();
        return 0;
    }
}
