package com.google.android.gms.internal.recaptcha;

import java.util.Map;

final class l0<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, k0> a;

    l0(Map.Entry entry, m0 m0Var) {
        this.a = entry;
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
        int i = k0.b;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof f1) {
            return this.a.getValue().a((f1) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
