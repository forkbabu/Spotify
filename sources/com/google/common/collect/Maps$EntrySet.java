package com.google.common.collect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class Maps$EntrySet<K, V> extends Sets$ImprovedAbstractSet<Map.Entry<K, V>> {
    Maps$EntrySet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        map().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        V v;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Map<K, V> map = map();
            map.getClass();
            try {
                v = map.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                v = null;
            }
            if (rw.equal(v, entry.getValue()) && (v != null || map().containsKey(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return map().isEmpty();
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, V> map();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            return map().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return Collections2.removeAllImpl(this, collection);
        } catch (UnsupportedOperationException unused) {
            return Collections2.removeAllImpl(this, collection.iterator());
        }
    }

    @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(collection.size());
            for (Object obj : collection) {
                if (contains(obj)) {
                    newHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                }
            }
            return map().keySet().retainAll(newHashSetWithExpectedSize);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return map().size();
    }
}
