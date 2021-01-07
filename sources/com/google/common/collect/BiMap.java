package com.google.common.collect;

import java.util.Map;
import java.util.Set;

public interface BiMap<K, V> extends Map<K, V> {
    V forcePut(K k, V v);

    /* renamed from: inverse */
    BiMap<V, K> mo68inverse();

    @Override // com.google.common.collect.BiMap
    V put(K k, V v);

    @Override // com.google.common.collect.BiMap
    void putAll(Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.BiMap
    /* renamed from: values */
    Set<V> mo50values();
}
