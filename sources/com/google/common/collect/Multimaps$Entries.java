package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class Multimaps$Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    Multimaps$Entries() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        AbstractMultimap.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractMultimap.this.containsEntry(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractMultimap.this.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return AbstractMultimap.this.size();
    }
}
