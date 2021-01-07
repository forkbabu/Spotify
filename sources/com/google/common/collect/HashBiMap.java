package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableCollection;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;
        final K key;

        EntryForKey(int i) {
            this.key = HashBiMap.this.keys[i];
            this.index = i;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            updateIndex();
            int i = this.index;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.values[i];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            updateIndex();
            int i = this.index;
            if (i == -1) {
                return (V) HashBiMap.this.put(this.key, v);
            }
            V v2 = HashBiMap.this.values[i];
            if (rw.equal(v2, v)) {
                return v;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v, false);
            return v2;
        }

        /* access modifiers changed from: package-private */
        public void updateIndex() {
            int i = this.index;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && rw.equal(hashBiMap.keys[i], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;
        final V value;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i) {
            this.biMap = hashBiMap;
            this.value = hashBiMap.values[i];
            this.index = i;
        }

        private void updateIndex() {
            int i = this.index;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i <= hashBiMap.size && rw.equal(this.value, hashBiMap.values[i])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getValue() {
            updateIndex();
            int i = this.index;
            if (i == -1) {
                return null;
            }
            return this.biMap.keys[i];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K setValue(K k) {
            updateIndex();
            int i = this.index;
            if (i == -1) {
                return this.biMap.putInverse(this.value, k, false);
            }
            K k2 = this.biMap.keys[i];
            if (rw.equal(k2, k)) {
                return k;
            }
            this.biMap.replaceKeyInEntry(this.index, k, false);
            return k2;
        }
    }

    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByKey = HashBiMap.this.findEntryByKey(key);
            if (findEntryByKey == -1 || !rw.equal(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public Object forEntry(int i) {
            return new EntryForKey(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int smearedHash = Collections2.smearedHash(key);
            int findEntryByKey = HashBiMap.this.findEntryByKey(key, smearedHash);
            if (findEntryByKey == -1 || !rw.equal(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet2 = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet2;
            return inverseEntrySet2;
        }

        @Override // com.google.common.collect.BiMap
        public K forcePut(V v, K k) {
            return this.forward.putInverse(v, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            HashBiMap<K, V> hashBiMap = this.forward;
            int findEntryByValue = hashBiMap.findEntryByValue(obj);
            if (findEntryByValue == -1) {
                return null;
            }
            return hashBiMap.keys[findEntryByValue];
        }

        @Override // com.google.common.collect.BiMap
        /* renamed from: inverse */
        public BiMap<K, V> mo68inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.mo50values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public K put(V v, K k) {
            return this.forward.putInverse(v, k, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K remove(Object obj) {
            HashBiMap<K, V> hashBiMap = this.forward;
            hashBiMap.getClass();
            int smearedHash = Collections2.smearedHash(obj);
            int findEntryByValue = hashBiMap.findEntryByValue(obj, smearedHash);
            if (findEntryByValue == -1) {
                return null;
            }
            K k = hashBiMap.keys[findEntryByValue];
            hashBiMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return k;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        /* renamed from: values */
        public Set<K> mo50values() {
            return this.forward.keySet();
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.biMap.findEntryByValue(key);
            if (findEntryByValue == -1 || !rw.equal(this.biMap.keys[findEntryByValue], value)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public Object forEntry(int i) {
            return new EntryForValue(this.biMap, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int smearedHash = Collections2.smearedHash(key);
            int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
            if (findEntryByValue == -1 || !rw.equal(this.biMap.keys[findEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public K forEntry(int i) {
            return HashBiMap.this.keys[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int smearedHash = Collections2.smearedHash(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, smearedHash);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public V forEntry(int i) {
            return HashBiMap.this.values[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int smearedHash = Collections2.smearedHash(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, smearedHash);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        /* access modifiers changed from: package-private */
        public abstract T forEntry(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                /* class com.google.common.collect.HashBiMap.View.AnonymousClass1 */
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (View.this.biMap.modCount == this.expectedModCount) {
                        return this.index != -2 && this.remaining > 0;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public T next() {
                    if (hasNext()) {
                        T t = (T) View.this.forEntry(this.index);
                        this.indexToRemove = this.index;
                        this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                        this.remaining--;
                        return t;
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (View.this.biMap.modCount == this.expectedModCount) {
                        MoreObjects.checkState(this.indexToRemove != -1, "no calls to next() since the last call to remove()");
                        View.this.biMap.removeEntry(this.indexToRemove);
                        int i = this.index;
                        HashBiMap<K, V> hashBiMap = View.this.biMap;
                        if (i == hashBiMap.size) {
                            this.index = this.indexToRemove;
                        }
                        this.indexToRemove = -1;
                        this.expectedModCount = hashBiMap.modCount;
                        return;
                    }
                    throw new ConcurrentModificationException();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i, int i2) {
        MoreObjects.checkArgument(i != -1);
        int[] iArr = this.hashTableKToV;
        int length = i2 & (iArr.length - 1);
        if (iArr[length] == i) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[length] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[length];
        int i4 = this.nextInBucketKToV[i3];
        while (true) {
            i3 = i4;
            if (i3 == -1) {
                StringBuilder V0 = je.V0("Expected to find entry with key ");
                V0.append((Object) this.keys[i]);
                throw new AssertionError(V0.toString());
            } else if (i3 == i) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i3] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.nextInBucketKToV[i3];
            }
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        MoreObjects.checkArgument(i != -1);
        int length = i2 & (this.hashTableKToV.length - 1);
        int[] iArr = this.hashTableVToK;
        if (iArr[length] == i) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[length] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[length];
        int i4 = this.nextInBucketVToK[i3];
        while (true) {
            i3 = i4;
            if (i3 == -1) {
                StringBuilder V0 = je.V0("Expected to find entry with value ");
                V0.append((Object) this.values[i]);
                throw new AssertionError(V0.toString());
            } else if (i3 == i) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i3] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.nextInBucketVToK[i3];
            }
        }
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int expandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, expandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, expandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, expandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, expandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, expandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, expandedCapacity);
        }
        if (this.hashTableKToV.length < i) {
            int closedTableSize = Collections2.closedTableSize(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(closedTableSize);
            this.hashTableVToK = createFilledWithAbsent(closedTableSize);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(Collections2.smearedHash(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[bucket];
                iArr3[bucket] = i2;
                int bucket2 = bucket(Collections2.smearedHash(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[bucket2];
                iArr5[bucket2] = i2;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void insertIntoTableKToV(int i, int i2) {
        MoreObjects.checkArgument(i != -1);
        int[] iArr = this.hashTableKToV;
        int length = i2 & (iArr.length - 1);
        this.nextInBucketKToV[i] = iArr[length];
        iArr[length] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        MoreObjects.checkArgument(i != -1);
        int length = i2 & (this.hashTableKToV.length - 1);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[length];
        iArr2[length] = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.common.collect.HashBiMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        Collections2.checkNonnegative(16, "expectedSize");
        int closedTableSize = Collections2.closedTableSize(16, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[16];
        this.values = (V[]) new Object[16];
        this.hashTableKToV = createFilledWithAbsent(closedTableSize);
        this.hashTableVToK = createFilledWithAbsent(closedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(16);
        this.nextInBucketVToK = createFilledWithAbsent(16);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(16);
        this.nextInInsertionOrder = createFilledWithAbsent(16);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void replaceKeyInEntry(int i, K k, boolean z) {
        MoreObjects.checkArgument(i != -1);
        int smearedHash = Collections2.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash);
        int i2 = this.lastInInsertionOrder;
        int i3 = -2;
        if (findEntryByKey != -1) {
            if (z) {
                i2 = this.prevInInsertionOrder[findEntryByKey];
                i3 = this.nextInInsertionOrder[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, smearedHash);
                if (i == this.size) {
                    i = findEntryByKey;
                }
            } else {
                throw new IllegalArgumentException("Key already present in map: " + ((Object) k));
            }
        }
        if (i2 == i) {
            i2 = this.prevInInsertionOrder[i];
        } else if (i2 == this.size) {
            i2 = findEntryByKey;
        }
        if (i3 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (i3 != this.size) {
            findEntryByKey = i3;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, Collections2.smearedHash(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, Collections2.smearedHash(k));
        setSucceeds(i2, i);
        setSucceeds(i, findEntryByKey);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void replaceValueInEntry(int i, V v, boolean z) {
        MoreObjects.checkArgument(i != -1);
        int smearedHash = Collections2.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, smearedHash);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + ((Object) v));
            }
        }
        deleteFromTableVToK(i, Collections2.smearedHash(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, smearedHash);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Collections2.writeMap(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    /* access modifiers changed from: package-private */
    public int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[i & (this.hashTableKToV.length - 1)];
        while (i2 != -1) {
            if (rw.equal(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, Collections2.smearedHash(obj));
    }

    /* access modifiers changed from: package-private */
    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, Collections2.smearedHash(obj));
    }

    @Override // com.google.common.collect.BiMap
    public V forcePut(K k, V v) {
        return put(k, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    @Override // com.google.common.collect.BiMap
    /* renamed from: inverse */
    public BiMap<V, K> mo68inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse2 = new Inverse(this);
        this.inverse = inverse2;
        return inverse2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public V put(K k, V v) {
        return put(k, v, false);
    }

    /* access modifiers changed from: package-private */
    public K putInverse(V v, K k, boolean z) {
        int smearedHash = Collections2.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (rw.equal(k2, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return k2;
        }
        int i = this.lastInInsertionOrder;
        int smearedHash2 = Collections2.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash2);
        if (!z) {
            MoreObjects.checkArgument(findEntryByKey == -1, "Key already present: %s", k);
        } else if (findEntryByKey != -1) {
            i = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k;
        this.values[i2] = v;
        insertIntoTableKToV(i2, smearedHash2);
        insertIntoTableVToK(this.size, smearedHash);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int smearedHash = Collections2.smearedHash(obj);
        int findEntryByKey = findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return v;
    }

    /* access modifiers changed from: package-private */
    public void removeEntry(int i) {
        removeEntry(i, Collections2.smearedHash(this.keys[i]), Collections2.smearedHash(this.values[i]));
    }

    /* access modifiers changed from: package-private */
    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, Collections2.smearedHash(this.values[i]));
    }

    /* access modifiers changed from: package-private */
    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, Collections2.smearedHash(this.keys[i]), i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    /* renamed from: values */
    public Collection mo50values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet2 = new ValueSet();
        this.valueSet = valueSet2;
        return valueSet2;
    }

    /* access modifiers changed from: package-private */
    public int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    /* access modifiers changed from: package-private */
    public int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    /* access modifiers changed from: package-private */
    public V put(K k, V v, boolean z) {
        int smearedHash = Collections2.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (rw.equal(v2, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return v2;
        }
        int smearedHash2 = Collections2.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash2);
        if (!z) {
            MoreObjects.checkArgument(findEntryByValue == -1, "Value already present: %s", v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, smearedHash);
        insertIntoTableVToK(this.size, smearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    private void removeEntry(int i, int i2, int i3) {
        MoreObjects.checkArgument(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        int i4 = this.size - 1;
        if (i4 != i) {
            int i5 = this.prevInInsertionOrder[i4];
            int i6 = this.nextInInsertionOrder[i4];
            setSucceeds(i5, i);
            setSucceeds(i, i6);
            K[] kArr = this.keys;
            K k = kArr[i4];
            V[] vArr = this.values;
            V v = vArr[i4];
            kArr[i] = k;
            vArr[i] = v;
            int bucket = bucket(Collections2.smearedHash(k));
            int[] iArr = this.hashTableKToV;
            if (iArr[bucket] == i4) {
                iArr[bucket] = i;
            } else {
                int i7 = iArr[bucket];
                int i8 = this.nextInBucketKToV[i7];
                while (true) {
                    i7 = i8;
                    if (i7 == i4) {
                        break;
                    }
                    i8 = this.nextInBucketKToV[i7];
                }
                this.nextInBucketKToV[i7] = i;
            }
            int[] iArr2 = this.nextInBucketKToV;
            iArr2[i] = iArr2[i4];
            iArr2[i4] = -1;
            int bucket2 = bucket(Collections2.smearedHash(v));
            int[] iArr3 = this.hashTableVToK;
            if (iArr3[bucket2] == i4) {
                iArr3[bucket2] = i;
            } else {
                int i9 = iArr3[bucket2];
                int i10 = this.nextInBucketVToK[i9];
                while (true) {
                    i9 = i10;
                    if (i9 == i4) {
                        break;
                    }
                    i10 = this.nextInBucketVToK[i9];
                }
                this.nextInBucketVToK[i9] = i;
            }
            int[] iArr4 = this.nextInBucketVToK;
            iArr4[i] = iArr4[i4];
            iArr4[i4] = -1;
        }
        K[] kArr2 = this.keys;
        int i11 = this.size;
        kArr2[i11 - 1] = null;
        this.values[i11 - 1] = null;
        this.size = i11 - 1;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    /* renamed from: values  reason: collision with other method in class */
    public Set<V> mo50values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet2 = new ValueSet();
        this.valueSet = valueSet2;
        return valueSet2;
    }
}
