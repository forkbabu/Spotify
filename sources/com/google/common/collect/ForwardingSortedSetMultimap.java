package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    protected ForwardingSortedSetMultimap() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract SortedSetMultimap<K, V> mo25delegate();

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    public Collection mo44get(Object obj) {
        return mo25delegate().mo44get((SortedSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll */
    public Collection mo45removeAll(Object obj) {
        return mo25delegate().mo45removeAll(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get  reason: collision with other method in class */
    public Set mo46get(Object obj) {
        return mo25delegate().mo44get((SortedSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll  reason: collision with other method in class */
    public Set mo48removeAll(Object obj) {
        return mo25delegate().mo45removeAll(obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get  reason: collision with other method in class */
    public SortedSet<V> mo47get(K k) {
        return mo25delegate().mo44get((SortedSetMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: removeAll  reason: collision with other method in class */
    public SortedSet<V> mo49removeAll(Object obj) {
        return mo25delegate().mo45removeAll(obj);
    }
}
