package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zzff extends zzeu<Map.Entry<K, V>> {
    private final /* synthetic */ zzfc zzaha;

    zzff(zzfc zzfc) {
        this.zzaha = zzfc;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        this.zzaha.getClass();
        s.i(i, 0);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zzaha.f[i2], this.zzaha.f[i2 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        this.zzaha.getClass();
        return 0;
    }
}
