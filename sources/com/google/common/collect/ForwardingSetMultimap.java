package com.google.common.collect;

import java.util.Set;

public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V> {
    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract SetMultimap<K, V> mo25delegate();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    public Set<V> mo44get(K k) {
        return mo25delegate().mo44get((SetMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll */
    public Set<V> mo45removeAll(Object obj) {
        return mo25delegate().mo45removeAll(obj);
    }
}
