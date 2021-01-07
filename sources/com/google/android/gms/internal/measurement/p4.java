package com.google.android.gms.internal.measurement;

import java.util.Map;

final class p4<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, o4> a;

    p4(Map.Entry entry, q4 q4Var) {
        this.a = entry;
    }

    public final o4 a() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        int i = o4.c;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof l5) {
            return this.a.getValue().a((l5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
