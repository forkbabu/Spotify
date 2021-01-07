package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient Map<K, V> delegate;
    private transient Set<Map.Entry<K, V>> entrySet;
    transient AbstractBiMap<V, K> inverse;
    private transient Set<K> keySet;
    private transient Set<V> valueSet;

    class BiMapEntry extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> delegate;

        BiMapEntry(Map.Entry<K, V> entry) {
            this.delegate = entry;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public Object mo25delegate() {
            return this.delegate;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            AbstractBiMap.this.checkValue(v);
            MoreObjects.checkState(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (rw.equal(v, getValue())) {
                return v;
            }
            MoreObjects.checkArgument(!AbstractBiMap.this.containsValue(v), "value already present: %s", v);
            V value = this.delegate.setValue(v);
            MoreObjects.checkState(rw.equal(v, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.access$500(AbstractBiMap.this, getKey(), true, value, v);
            return value;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Map.Entry<K, V> mo25delegate() {
            return this.delegate;
        }
    }

    /* access modifiers changed from: private */
    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        final Set<Map.Entry<K, V>> esDelegate;

        EntrySet(AnonymousClass1 r2) {
            this.esDelegate = AbstractBiMap.this.delegate.entrySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Set<Map.Entry<K, V>> set = this.esDelegate;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            return set.contains(new Maps$7(entry));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return Collections2.containsAllImpl(this, collection);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public Object mo25delegate() {
            return this.esDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.entrySetIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.esDelegate.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractBiMap) AbstractBiMap.this.inverse).delegate.remove(entry.getValue());
            this.esDelegate.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return Collections2.removeAllImpl(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Collections2.toArrayImpl(this, tArr);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Collection mo26delegate() {
            return this.esDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Set<Map.Entry<K, V>> mo27delegate() {
            return this.esDelegate;
        }
    }

    /* access modifiers changed from: package-private */
    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap, null);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.inverse = (AbstractBiMap) objectInputStream.readObject();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(mo68inverse());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractBiMap
        public K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractBiMap
        public V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public /* bridge */ /* synthetic */ Object mo25delegate() {
            return AbstractBiMap.super.mo25delegate();
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return mo68inverse().mo68inverse();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        /* renamed from: values */
        public /* bridge */ /* synthetic */ Collection mo50values() {
            return AbstractBiMap.super.mo50values();
        }
    }

    /* access modifiers changed from: private */
    public class KeySet extends ForwardingSet<K> {
        KeySet(AnonymousClass1 r2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public Set<K> mo25delegate() {
            return AbstractBiMap.this.delegate.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new Maps$1(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!mo25delegate().contains(obj)) {
                return false;
            }
            AbstractBiMap.access$200(AbstractBiMap.this, obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return Collections2.removeAllImpl(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }
    }

    /* access modifiers changed from: private */
    public class ValueSet extends ForwardingSet<V> {
        final Set<V> valuesDelegate;

        ValueSet(AnonymousClass1 r2) {
            this.valuesDelegate = AbstractBiMap.this.inverse.keySet();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public Object mo25delegate() {
            return this.valuesDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new Maps$2(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Collections2.toArrayImpl(this, tArr);
        }

        @Override // com.google.common.collect.ForwardingObject, java.lang.Object
        public String toString() {
            StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(size());
            newStringBuilderForCollection.append('[');
            Iterator<V> it = iterator();
            boolean z = true;
            while (it.hasNext()) {
                V next = it.next();
                if (!z) {
                    newStringBuilderForCollection.append(", ");
                }
                z = false;
                if (next == this) {
                    newStringBuilderForCollection.append("(this Collection)");
                } else {
                    newStringBuilderForCollection.append((Object) next);
                }
            }
            newStringBuilderForCollection.append(']');
            return newStringBuilderForCollection.toString();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Collection mo28delegate() {
            return this.valuesDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: delegate  reason: collision with other method in class */
        public Set<V> mo29delegate() {
            return this.valuesDelegate;
        }
    }

    AbstractBiMap(Map map, AbstractBiMap abstractBiMap, AnonymousClass1 r3) {
        this.delegate = map;
        this.inverse = abstractBiMap;
    }

    static Object access$200(AbstractBiMap abstractBiMap, Object obj) {
        V remove = abstractBiMap.delegate.remove(obj);
        abstractBiMap.removeFromInverseMap(remove);
        return remove;
    }

    static void access$500(AbstractBiMap abstractBiMap, Object obj, boolean z, Object obj2, Object obj3) {
        if (z) {
            ((AbstractBiMap) abstractBiMap.inverse).delegate.remove(obj2);
        }
        ((AbstractBiMap) abstractBiMap.inverse).delegate.put(obj3, obj);
    }

    static void access$600(AbstractBiMap abstractBiMap, Object obj) {
        ((AbstractBiMap) abstractBiMap.inverse).delegate.remove(obj);
    }

    private V putInBothMaps(K k, V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean containsKey = containsKey(k);
        if (containsKey && rw.equal(v, get(k))) {
            return v;
        }
        if (z) {
            mo68inverse().remove(v);
        } else {
            MoreObjects.checkArgument(!containsValue(v), "value already present: %s", v);
        }
        V put = this.delegate.put(k, v);
        if (containsKey) {
            this.inverse.delegate.remove(put);
        }
        this.inverse.delegate.put(v, k);
        return put;
    }

    private void removeFromInverseMap(V v) {
        this.inverse.delegate.remove(v);
    }

    /* access modifiers changed from: package-private */
    public K checkKey(K k) {
        return k;
    }

    /* access modifiers changed from: package-private */
    public V checkValue(V v) {
        return v;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet(null);
        this.entrySet = entrySet2;
        return entrySet2;
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        final Iterator<Map.Entry<K, V>> it = this.delegate.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>() {
            /* class com.google.common.collect.AbstractBiMap.AnonymousClass1 */
            Map.Entry<K, V> entry;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry<K, V> entry2 = (Map.Entry) it.next();
                this.entry = entry2;
                return new BiMapEntry(entry2);
            }

            @Override // java.util.Iterator
            public void remove() {
                MoreObjects.checkState(this.entry != null, "no calls to next() since the last call to remove()");
                V value = this.entry.getValue();
                it.remove();
                AbstractBiMap.access$600(AbstractBiMap.this, value);
                this.entry = null;
            }
        };
    }

    @Override // com.google.common.collect.BiMap
    public V forcePut(K k, V v) {
        return putInBothMaps(k, v, true);
    }

    @Override // com.google.common.collect.BiMap
    /* renamed from: inverse */
    public BiMap<V, K> mo68inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet2 = new KeySet(null);
        this.keySet = keySet2;
        return keySet2;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public V put(K k, V v) {
        return putInBothMaps(k, v, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.common.collect.AbstractBiMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public V remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        V remove = this.delegate.remove(obj);
        removeFromInverseMap(remove);
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        boolean z = false;
        MoreObjects.checkState(this.delegate == null);
        MoreObjects.checkState(this.inverse == null);
        MoreObjects.checkArgument(map.isEmpty());
        MoreObjects.checkArgument(map2.isEmpty());
        if (map != map2) {
            z = true;
        }
        MoreObjects.checkArgument(z);
        this.delegate = map;
        this.inverse = new Inverse(map2, this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public Map<K, V> mo25delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    /* renamed from: values */
    public Set<V> mo50values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet2 = new ValueSet(null);
        this.valueSet = valueSet2;
        return valueSet2;
    }
}
