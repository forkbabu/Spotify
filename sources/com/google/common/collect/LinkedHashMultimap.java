package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 1;
    private transient ValueEntry<K, V> multimapHeaderEntry;
    transient int valueSetCapacity = 2;

    /* access modifiers changed from: package-private */
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {
        ValueEntry<K, V> nextInValueBucket;
        ValueEntry<K, V> predecessorInMultimap;
        ValueSetLink<K, V> predecessorInValueSet;
        final int smearedValueHash;
        ValueEntry<K, V> successorInMultimap;
        ValueSetLink<K, V> successorInValueSet;

        ValueEntry(K k, V v, int i, ValueEntry<K, V> valueEntry) {
            super(k, v);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getSuccessorInValueSet() {
            return this.successorInValueSet;
        }

        /* access modifiers changed from: package-private */
        public boolean matchesValue(Object obj, int i) {
            return this.smearedValueHash == i && rw.equal(this.value, obj);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.predecessorInValueSet = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.successorInValueSet = valueSetLink;
        }
    }

    /* access modifiers changed from: package-private */
    public final class ValueSet extends Sets$ImprovedAbstractSet<V> implements ValueSetLink<K, V> {
        private ValueSetLink<K, V> firstEntry;
        ValueEntry<K, V>[] hashTable;
        private final K key;
        private ValueSetLink<K, V> lastEntry;
        private int modCount = 0;
        private int size = 0;

        ValueSet(K k, int i) {
            this.key = k;
            this.firstEntry = this;
            this.lastEntry = this;
            this.hashTable = new ValueEntry[Collections2.closedTableSize(i, 1.0d)];
        }

        private int mask() {
            return this.hashTable.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(V v) {
            int smearedHash = Collections2.smearedHash(v);
            int mask = mask() & smearedHash;
            ValueEntry<K, V> valueEntry = this.hashTable[mask];
            ValueEntry<K, V> valueEntry2 = valueEntry;
            while (true) {
                boolean z = false;
                if (valueEntry2 == null) {
                    ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.key, v, smearedHash, valueEntry);
                    ValueSetLink<K, V> valueSetLink = this.lastEntry;
                    valueSetLink.setSuccessorInValueSet(valueEntry3);
                    valueEntry3.predecessorInValueSet = valueSetLink;
                    valueEntry3.successorInValueSet = this;
                    this.lastEntry = valueEntry3;
                    ValueEntry<K, V> valueEntry4 = LinkedHashMultimap.this.multimapHeaderEntry.predecessorInMultimap;
                    valueEntry4.successorInMultimap = valueEntry3;
                    valueEntry3.predecessorInMultimap = valueEntry4;
                    ValueEntry<K, V> valueEntry5 = LinkedHashMultimap.this.multimapHeaderEntry;
                    valueEntry3.successorInMultimap = valueEntry5;
                    valueEntry5.predecessorInMultimap = valueEntry3;
                    ValueEntry<K, V>[] valueEntryArr = this.hashTable;
                    valueEntryArr[mask] = valueEntry3;
                    int i = this.size + 1;
                    this.size = i;
                    this.modCount++;
                    int length = valueEntryArr.length;
                    double d = (double) length;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    if (((double) i) > d * 1.0d && length < 1073741824) {
                        z = true;
                    }
                    if (z) {
                        int length2 = this.hashTable.length * 2;
                        ValueEntry<K, V>[] valueEntryArr2 = new ValueEntry[length2];
                        this.hashTable = valueEntryArr2;
                        int i2 = length2 - 1;
                        for (ValueSetLink<K, V> valueSetLink2 = this.firstEntry; valueSetLink2 != this; valueSetLink2 = valueSetLink2.getSuccessorInValueSet()) {
                            ValueEntry<K, V> valueEntry6 = (ValueEntry) valueSetLink2;
                            int i3 = valueEntry6.smearedValueHash & i2;
                            valueEntry6.nextInValueBucket = valueEntryArr2[i3];
                            valueEntryArr2[i3] = valueEntry6;
                        }
                    }
                    return true;
                } else if (valueEntry2.matchesValue(v, smearedHash)) {
                    return false;
                } else {
                    valueEntry2 = valueEntry2.nextInValueBucket;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.hashTable, (Object) null);
            this.size = 0;
            for (ValueSetLink<K, V> valueSetLink = this.firstEntry; valueSetLink != this; valueSetLink = valueSetLink.getSuccessorInValueSet()) {
                ValueEntry valueEntry = (ValueEntry) valueSetLink;
                ValueEntry<K, V> valueEntry2 = valueEntry.predecessorInMultimap;
                ValueEntry<K, V> valueEntry3 = valueEntry.successorInMultimap;
                valueEntry2.successorInMultimap = valueEntry3;
                valueEntry3.predecessorInMultimap = valueEntry2;
            }
            this.firstEntry = this;
            this.lastEntry = this;
            this.modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int smearedHash = Collections2.smearedHash(obj);
            for (ValueEntry<K, V> valueEntry = this.hashTable[mask() & smearedHash]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, smearedHash)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getSuccessorInValueSet() {
            return this.firstEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<V> iterator() {
            return new Iterator<V>() {
                /* class com.google.common.collect.LinkedHashMultimap.ValueSet.AnonymousClass1 */
                int expectedModCount;
                ValueSetLink<K, V> nextEntry;
                ValueEntry<K, V> toRemove;

                {
                    this.nextEntry = ValueSet.this.firstEntry;
                    this.expectedModCount = ValueSet.this.modCount;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (ValueSet.this.modCount == this.expectedModCount) {
                        return this.nextEntry != ValueSet.this;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public V next() {
                    if (hasNext()) {
                        ValueEntry<K, V> valueEntry = (ValueEntry) this.nextEntry;
                        V v = valueEntry.value;
                        this.toRemove = valueEntry;
                        this.nextEntry = valueEntry.successorInValueSet;
                        return v;
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (ValueSet.this.modCount == this.expectedModCount) {
                        MoreObjects.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                        ValueSet.this.remove(this.toRemove.value);
                        this.expectedModCount = ValueSet.this.modCount;
                        this.toRemove = null;
                        return;
                    }
                    throw new ConcurrentModificationException();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int smearedHash = Collections2.smearedHash(obj);
            int mask = mask() & smearedHash;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.hashTable[mask]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, smearedHash)) {
                    if (valueEntry == null) {
                        this.hashTable[mask] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    ValueSetLink<K, V> valueSetLink = valueEntry2.predecessorInValueSet;
                    ValueSetLink<K, V> valueSetLink2 = valueEntry2.successorInValueSet;
                    valueSetLink.setSuccessorInValueSet(valueSetLink2);
                    valueSetLink2.setPredecessorInValueSet(valueSetLink);
                    ValueEntry<K, V> valueEntry3 = valueEntry2.predecessorInMultimap;
                    ValueEntry<K, V> valueEntry4 = valueEntry2.successorInMultimap;
                    valueEntry3.successorInMultimap = valueEntry4;
                    valueEntry4.predecessorInMultimap = valueEntry3;
                    this.size--;
                    this.modCount++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.lastEntry = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.firstEntry = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }
    }

    /* access modifiers changed from: private */
    public interface ValueSetLink<K, V> {
        ValueSetLink<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink);

        void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink);
    }

    private LinkedHashMultimap(int i, int i2) {
        super(new CompactLinkedHashMap(i));
        Collections2.checkNonnegative(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        ValueEntry<K, V> valueEntry = new ValueEntry<>(null, null, 0, null);
        this.multimapHeaderEntry = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.common.collect.LinkedHashMultimap<K, V> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.common.collect.CompactLinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> valueEntry = new ValueEntry<>(null, null, 0, null);
        this.multimapHeaderEntry = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            compactLinkedHashMap.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            ((Collection) compactLinkedHashMap.get(readObject2)).add(objectInputStream.readObject());
        }
        setMap(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        for (K k : super.keySet()) {
            objectOutputStream.writeObject(k);
        }
        objectOutputStream.writeInt(super.size());
        for (Map.Entry entry : (Set) entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.multimapHeaderEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: createCollection */
    public Collection mo75createCollection() {
        return new CompactLinkedHashSet(this.valueSetCapacity);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new Iterator<Map.Entry<K, V>>() {
            /* class com.google.common.collect.LinkedHashMultimap.AnonymousClass1 */
            ValueEntry<K, V> nextEntry;
            ValueEntry<K, V> toRemove;

            {
                this.nextEntry = LinkedHashMultimap.this.multimapHeaderEntry.successorInMultimap;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.nextEntry != LinkedHashMultimap.this.multimapHeaderEntry;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    ValueEntry<K, V> valueEntry = this.nextEntry;
                    this.toRemove = valueEntry;
                    this.nextEntry = valueEntry.successorInMultimap;
                    return valueEntry;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                MoreObjects.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
                ValueEntry<K, V> valueEntry = this.toRemove;
                linkedHashMultimap.remove(valueEntry.key, valueEntry.value);
                this.toRemove = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return super.keySet();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> createCollection(K k) {
        return new ValueSet(k, this.valueSetCapacity);
    }
}
