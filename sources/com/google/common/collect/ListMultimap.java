package com.google.common.collect;

import java.util.List;

public interface ListMultimap<K, V> extends Multimap<K, V> {
    /* renamed from: get */
    List<V> mo44get(K k);

    /* renamed from: removeAll */
    List<V> mo45removeAll(Object obj);
}
