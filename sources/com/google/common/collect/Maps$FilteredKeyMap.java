package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class Maps$FilteredKeyMap<K, V> extends Maps$AbstractFilteredMap<K, V> {
    final Predicate<? super K> keyPredicate;

    Maps$FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Map.Entry<K, V>> predicate2) {
        super(map, predicate2);
        this.keyPredicate = predicate;
    }

    @Override // com.google.common.collect.Maps$AbstractFilteredMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.unfiltered.containsKey(obj) && this.keyPredicate.apply(obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    public Set<Map.Entry<K, V>> createEntrySet() {
        return Collections2.filter((Set) this.unfiltered.entrySet(), (Predicate) this.predicate);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    /* renamed from: createKeySet */
    public Set<K> mo30createKeySet() {
        return Collections2.filter((Set) this.unfiltered.keySet(), (Predicate) this.keyPredicate);
    }
}
