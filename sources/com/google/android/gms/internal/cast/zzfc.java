package com.google.android.gms.internal.cast;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class zzfc<K, V> extends zzfb<Map.Entry<K, V>> {
    private final transient zzey<K, V> c;
    private final transient Object[] f;

    /* JADX WARN: Incorrect args count in method signature: (Lcom/google/android/gms/internal/cast/zzey<TK;TV;>;[Ljava/lang/Object;II)V */
    zzfc(zzey zzey, Object[] objArr) {
        this.c = zzey;
        this.f = objArr;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final int c(Object[] objArr, int i) {
        return i().c(objArr, i);
    }

    @Override // com.google.android.gms.internal.cast.zzet, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.c.getClass();
                if (value.equals(null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzet
    /* renamed from: d */
    public final v0<Map.Entry<K, V>> iterator() {
        return (v0) i().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
