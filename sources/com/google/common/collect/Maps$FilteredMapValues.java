package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class Maps$FilteredMapValues<K, V> extends Maps$Values<K, V> {
    final Predicate<? super Map.Entry<K, V>> predicate;
    final Map<K, V> unfiltered;

    Maps$FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate2) {
        super(map);
        this.unfiltered = map2;
        this.predicate = predicate2;
    }

    @Override // com.google.common.collect.Maps$Values, java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        Iterator<Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.predicate.apply(next) && rw.equal(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Maps$Values, java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.predicate.apply(next) && collection.contains(next.getValue())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.common.collect.Maps$Values, java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.predicate.apply(next) && !collection.contains(next.getValue())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return Collections2.newArrayList(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) Collections2.newArrayList(iterator()).toArray(tArr);
    }
}
