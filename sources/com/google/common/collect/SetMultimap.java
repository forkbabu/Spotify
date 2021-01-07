package com.google.common.collect;

import java.util.Set;

public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    Set<V> mo44get(K k);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll */
    Set<V> mo45removeAll(Object obj);
}
