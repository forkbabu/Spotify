package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    @Override // java.lang.Object
    boolean equals(Object obj);

    @Override // com.google.common.collect.ListMultimap
    /* renamed from: get */
    Collection<V> mo44get(K k);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    @Override // com.google.common.collect.ListMultimap
    /* renamed from: removeAll */
    Collection<V> mo45removeAll(Object obj);

    int size();
}
