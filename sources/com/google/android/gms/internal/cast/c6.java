package com.google.android.gms.internal.cast;

import java.util.Map;

final class c6<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, b6> a;

    c6(Map.Entry entry, d6 d6Var) {
        this.a = entry;
    }

    public final b6 a() {
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
        int i = b6.c;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof z6) {
            return this.a.getValue().b((z6) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
