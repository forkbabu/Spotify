package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    protected ForwardingMultimap() {
    }

    @Override // com.google.common.collect.Multimap
    public Map<K, Collection<V>> asMap() {
        return mo25delegate().asMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        mo25delegate().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        return mo25delegate().containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return mo25delegate().containsKey(obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract Multimap<K, V> mo25delegate();

    @Override // com.google.common.collect.Multimap, java.lang.Object
    public boolean equals(Object obj) {
        return obj == this || mo25delegate().equals(obj);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return mo25delegate().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return mo25delegate().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        return mo25delegate().keySet();
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        return mo25delegate().put(k, v);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        return mo25delegate().remove(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return mo25delegate().size();
    }
}
