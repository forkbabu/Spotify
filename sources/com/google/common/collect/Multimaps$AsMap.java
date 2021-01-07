package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class Multimaps$AsMap<K, V> extends Maps$ViewCachingAbstractMap<K, Collection<V>> {
    private final Multimap<K, V> multimap;

    class EntrySet extends Maps$EntrySet<K, Collection<V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            Set<K> keySet = Multimaps$AsMap.this.multimap.keySet();
            return new Maps$3(keySet.iterator(), new Function<K, Collection<V>>() {
                /* class com.google.common.collect.Multimaps$AsMap.EntrySet.AnonymousClass1 */

                @Override // com.google.common.base.Function
                public Object apply(Object obj) {
                    return Multimaps$AsMap.this.multimap.mo44get(obj);
                }
            });
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps$EntrySet
        public Map<K, Collection<V>> map() {
            return Multimaps$AsMap.this;
        }

        @Override // com.google.common.collect.Maps$EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Multimaps$AsMap.this.removeValuesForKey(((Map.Entry) obj).getKey());
            return true;
        }
    }

    Multimaps$AsMap(Multimap<K, V> multimap2) {
        this.multimap = multimap2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.multimap.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.multimap.containsKey(obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
        return new EntrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (this.multimap.containsKey(obj)) {
            return this.multimap.mo44get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.multimap.isEmpty();
    }

    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        return this.multimap.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (this.multimap.containsKey(obj)) {
            return this.multimap.mo45removeAll(obj);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void removeValuesForKey(Object obj) {
        this.multimap.keySet().remove(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.multimap.keySet().size();
    }
}
