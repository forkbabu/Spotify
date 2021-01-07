package com.google.common.collect;

import java.util.Map;

final class Maps$7 extends AbstractMapEntry<K, V> {
    final /* synthetic */ Map.Entry val$entry;

    Maps$7(Map.Entry entry) {
        this.val$entry = entry;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    public K getKey() {
        return (K) this.val$entry.getKey();
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    public V getValue() {
        return (V) this.val$entry.getValue();
    }
}
