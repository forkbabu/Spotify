package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {
    protected ForwardingMap() {
    }

    @Override // java.util.Map
    public void clear() {
        mo25delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo25delegate().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo25delegate().containsValue(obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract /* bridge */ /* synthetic */ Object mo25delegate();

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract Map<K, V> mo25delegate();

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return mo25delegate().entrySet();
    }

    @Override // java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        return obj == this || mo25delegate().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return mo25delegate().get(obj);
    }

    @Override // java.util.Map, java.lang.Object
    public int hashCode() {
        return mo25delegate().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo25delegate().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return mo25delegate().keySet();
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public V put(K k, V v) {
        return mo25delegate().put(k, v);
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        mo25delegate().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return mo25delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo25delegate().size();
    }

    /* access modifiers changed from: protected */
    public void standardClear() {
        Collections2.clear(entrySet().iterator());
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsKey(Object obj) {
        return Collections2.contains(new Maps$1(entrySet().iterator()), obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsValue(Object obj) {
        return Collections2.contains(new Maps$2(entrySet().iterator()), obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        return Collections2.equalsImpl(this, obj);
    }

    /* access modifiers changed from: protected */
    public int standardHashCode() {
        return Collections2.hashCodeImpl(entrySet());
    }

    /* access modifiers changed from: protected */
    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.common.collect.ForwardingMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public void standardPutAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: protected */
    public V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (rw.equal(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String standardToString() {
        return Collections2.toStringImpl(this);
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    /* renamed from: values */
    public Collection<V> mo50values() {
        return mo25delegate().values();
    }
}
