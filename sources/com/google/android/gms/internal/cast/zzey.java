package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class zzey<K, V> implements Serializable, Map<K, V> {
    private transient zzfb<Map.Entry<K, V>> a;
    private transient zzfb<K> b;
    private transient zzet<V> c;

    zzey() {
    }

    /* access modifiers changed from: package-private */
    public abstract zzfb<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract zzfb<K> b();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzet) values()).contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract zzet<V> d();

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzfb<Map.Entry<K, V>> zzfb = this.a;
        if (zzfb != null) {
            return zzfb;
        }
        zzfb<Map.Entry<K, V>> a2 = a();
        this.a = a2;
        return a2;
    }

    @Override // java.lang.Object, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        return v;
    }

    @Override // java.lang.Object, java.util.Map
    public int hashCode() {
        return s.j((zzfb) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((zzfd) this).size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzfb<K> zzfb = this.b;
        if (zzfb != null) {
            return zzfb;
        }
        zzfb<K> b2 = b();
        this.b = b2;
        return b2;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Object
    public String toString() {
        s.g(0, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) 0) << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzet<V> zzet = this.c;
        if (zzet != null) {
            return zzet;
        }
        zzet<V> d = d();
        this.c = d;
        return d;
    }
}
