package com.google.common.collect;

import java.util.Collection;
import java.util.List;

public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    protected ForwardingListMultimap() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract ListMultimap<K, V> mo25delegate();

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    public Collection mo44get(Object obj) {
        return mo25delegate().mo44get((ListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll */
    public Collection mo45removeAll(Object obj) {
        return mo25delegate().mo45removeAll(obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get  reason: collision with other method in class */
    public List<V> mo44get(K k) {
        return mo25delegate().mo44get((ListMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll  reason: collision with other method in class */
    public List<V> mo45removeAll(Object obj) {
        return mo25delegate().mo45removeAll(obj);
    }
}
