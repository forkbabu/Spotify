package com.google.android.gms.internal.measurement;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class f6 implements Comparable<f6>, Map.Entry<K, V> {
    private final K a;
    private V b;
    private final /* synthetic */ c6 c;

    f6(c6 c6Var, Map.Entry<K, V> entry) {
        V value = entry.getValue();
        this.c = c6Var;
        this.a = entry.getKey();
        this.b = value;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(f6 f6Var) {
        return this.a.compareTo(f6Var.a);
    }

    @Override // java.lang.Object, java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k = this.a;
        Object key = entry.getKey();
        if (k == null) {
            z = key == null;
        } else {
            z = k.equals(key);
        }
        if (z) {
            V v = this.b;
            Object value = entry.getValue();
            if (v == null) {
                z2 = value == null;
            } else {
                z2 = v.equals(value);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.lang.Object, java.util.Map.Entry
    public final int hashCode() {
        K k = this.a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.c.n();
        V v2 = this.b;
        this.b = v;
        return v2;
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return je.j0(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }

    f6(c6 c6Var, K k, V v) {
        this.c = c6Var;
        this.a = k;
        this.b = v;
    }
}
