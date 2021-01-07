package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    public static class Builder<K, V> {
        Map<K, Collection<V>> builderMap = new CompactHashMap();
    }

    private static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<K, V> multimap;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.multimap.map.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: iterator */
        public UnmodifiableIterator<Map.Entry<K, V>> mo41iterator() {
            ImmutableMultimap<K, V> immutableMultimap = this.multimap;
            immutableMultimap.getClass();
            return new UnmodifiableIterator<Map.Entry<K, V>>() {
                /* class com.google.common.collect.ImmutableMultimap.AnonymousClass1 */
                final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> asMapItr;
                K currentKey = null;
                Iterator<V> valueItr = Iterators$ArrayItr.EMPTY;

                {
                    this.asMapItr = ImmutableMultimap.this.map.entrySet().iterator();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.valueItr.hasNext() || this.asMapItr.hasNext();
                }

                @Override // java.util.Iterator
                public Object next() {
                    if (!this.valueItr.hasNext()) {
                        Map.Entry entry = (Map.Entry) this.asMapItr.next();
                        this.currentKey = (K) entry.getKey();
                        this.valueItr = ((ImmutableCollection) entry.getValue()).iterator();
                    }
                    return new ImmutableEntry(this.currentKey, this.valueItr.next());
                }
            };
        }
    }

    static class FieldSettersHolder {
        static final Serialization$FieldSetter<ImmutableMultimap> MAP_FIELD_SETTER = Collections2.getFieldSetter(ImmutableMultimap.class, "map");
        static final Serialization$FieldSetter<ImmutableMultimap> SIZE_FIELD_SETTER = Collections2.getFieldSetter(ImmutableMultimap.class, "size");
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Map asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.Multimap
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public Collection createEntries() {
        return new EntryCollection(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public Iterator entryIterator() {
        return new UnmodifiableIterator<Map.Entry<K, V>>() {
            /* class com.google.common.collect.ImmutableMultimap.AnonymousClass1 */
            final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> asMapItr;
            K currentKey = null;
            Iterator<V> valueItr = Iterators$ArrayItr.EMPTY;

            {
                this.asMapItr = ImmutableMultimap.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.asMapItr.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!this.valueItr.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.asMapItr.next();
                    this.currentKey = (K) entry.getKey();
                    this.valueItr = ((ImmutableCollection) entry.getValue()).iterator();
                }
                return new ImmutableEntry(this.currentKey, this.valueItr.next());
            }
        };
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    public abstract ImmutableCollection<V> mo44get(K k);

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.Multimap
    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    /* renamed from: removeAll */
    public ImmutableCollection<V> mo45removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }
}
