package com.google.android.gms.internal.cast;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class zzfd<K, V> extends zzey<K, V> {
    static final zzey<Object, Object> n = new zzfd(new Object[0]);
    private final transient Object[] f;

    private zzfd(Object[] objArr) {
        this.f = objArr;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzey
    public final zzfb<Map.Entry<K, V>> a() {
        return new zzfc(this, this.f);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzey
    public final zzfb<K> b() {
        return new zzfe(this, new zzfh(this.f, 0));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzey
    public final zzet<V> d() {
        return new zzfh(this.f, 1);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return 0;
    }
}
