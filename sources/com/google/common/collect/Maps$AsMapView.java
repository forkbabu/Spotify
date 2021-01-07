package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class Maps$AsMapView<K, V> extends Maps$ViewCachingAbstractMap<K, V> {
    final Function<? super K, V> function;
    private final Set<K> set;

    Maps$AsMapView(Set<K> set2, Function<? super K, V> function2) {
        set2.getClass();
        this.set = set2;
        function2.getClass();
        this.function = function2;
    }

    /* access modifiers changed from: package-private */
    public Set<K> backingSet() {
        return this.set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.set.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.set.contains(obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    public Set<Map.Entry<K, V>> createEntrySet() {
        return new Maps$EntrySet<K, V>() {
            /* class com.google.common.collect.Maps$AsMapView.AnonymousClass1EntrySetImpl */

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                Set<K> backingSet = Maps$AsMapView.this.backingSet();
                return new Maps$3(backingSet.iterator(), Maps$AsMapView.this.function);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.Maps$EntrySet
            public Map<K, V> map() {
                return Maps$AsMapView.this;
            }
        };
    }

    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    /* renamed from: createKeySet */
    public Set<K> mo30createKeySet() {
        return new Maps$4(this.set);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    public Collection<V> createValues() {
        return new Collections2.TransformedCollection(this.set, this.function);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (Collections2.safeContains(this.set, obj)) {
            return this.function.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (this.set.remove(obj)) {
            return this.function.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.set.size();
    }
}
