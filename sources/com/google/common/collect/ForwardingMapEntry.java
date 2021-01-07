package com.google.common.collect;

import java.util.Map;

public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    protected ForwardingMapEntry() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract Map.Entry<K, V> mo25delegate();

    @Override // java.util.Map.Entry, java.lang.Object
    public boolean equals(Object obj) {
        return mo25delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return mo25delegate().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return mo25delegate().getValue();
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public int hashCode() {
        return mo25delegate().hashCode();
    }
}
