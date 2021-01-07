package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class Maps$KeySet<K, V> extends Sets$ImprovedAbstractSet<K> {
    final Map<K, V> map;

    Maps$KeySet(Map<K, V> map2) {
        map2.getClass();
        this.map = map2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<K> iterator() {
        return new Maps$1(this.map.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.map.containsKey(obj)) {
            return false;
        }
        this.map.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }
}
