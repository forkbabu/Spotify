package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class Maps$FilteredEntryMap<K, V> extends Maps$AbstractFilteredMap<K, V> {
    final Set<Map.Entry<K, V>> filteredEntrySet;

    private class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        EntrySet(Maps$1 maps$1) {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public Object mo25delegate() {
            return Maps$FilteredEntryMap.this.filteredEntrySet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(Maps$FilteredEntryMap.this.filteredEntrySet.iterator()) {
                /* class com.google.common.collect.Maps$FilteredEntryMap.EntrySet.AnonymousClass1 */

                /* access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public Object transform(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<K, V>() {
                        /* class com.google.common.collect.Maps$FilteredEntryMap.EntrySet.AnonymousClass1.AnonymousClass1 */

                        /* access modifiers changed from: protected */
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* renamed from: delegate */
                        public Object mo25delegate() {
                            return entry;
                        }

                        @Override // java.util.Map.Entry
                        public V setValue(V v) {
                            MoreObjects.checkArgument(Maps$FilteredEntryMap.this.apply(getKey(), v));
                            return mo67delegate().setValue(v);
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* renamed from: delegate  reason: collision with other method in class */
                        public Map.Entry<K, V> mo67delegate() {
                            return entry;
                        }
                    };
                }
            };
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Collection mo65delegate() {
            return Maps$FilteredEntryMap.this.filteredEntrySet;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Set<Map.Entry<K, V>> mo66delegate() {
            return Maps$FilteredEntryMap.this.filteredEntrySet;
        }
    }

    class KeySet extends Maps$KeySet<K, V> {
        KeySet() {
            super(Maps$FilteredEntryMap.this);
        }

        @Override // com.google.common.collect.Maps$KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!Maps$FilteredEntryMap.this.containsKey(obj)) {
                return false;
            }
            Maps$FilteredEntryMap.this.unfiltered.remove(obj);
            return true;
        }

        @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Maps$FilteredEntryMap maps$FilteredEntryMap = Maps$FilteredEntryMap.this;
            Map<K, V> map = maps$FilteredEntryMap.unfiltered;
            Predicate<? super Map.Entry<K, V>> predicate = maps$FilteredEntryMap.predicate;
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Maps$FilteredEntryMap maps$FilteredEntryMap = Maps$FilteredEntryMap.this;
            Map<K, V> map = maps$FilteredEntryMap.unfiltered;
            Predicate<? super Map.Entry<K, V>> predicate = maps$FilteredEntryMap.predicate;
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Collections2.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Collections2.newArrayList(iterator()).toArray(tArr);
        }
    }

    Maps$FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        super(map, predicate);
        this.filteredEntrySet = Collections2.filter((Set) map.entrySet(), (Predicate) this.predicate);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    public Set<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps$ViewCachingAbstractMap
    /* renamed from: createKeySet */
    public Set<K> mo30createKeySet() {
        return new KeySet();
    }
}
