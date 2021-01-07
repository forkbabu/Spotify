package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Multiset;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.primitives.Ints;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(new ObjectCountHashMap());
    final transient ObjectCountHashMap<E> contents;
    private transient ImmutableSet<E> elementSet;
    private final transient int size;

    /* access modifiers changed from: private */
    public final class ElementSet extends IndexedImmutableSet<E> {
        ElementSet(AnonymousClass1 r2) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i) {
            ObjectCountHashMap<E> objectCountHashMap = RegularImmutableMultiset.this.contents;
            MoreObjects.checkElementIndex(i, objectCountHashMap.size, "index");
            return (E) objectCountHashMap.keys[i];
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.contents.size;
        }
    }

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        SerializedForm(Multiset<?> multiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) multiset;
            int size = immutableMultiset.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry<E> entry : immutableMultiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    break;
                }
                Object obj = objArr[i];
                int i2 = this.counts[i];
                if (i2 != 0) {
                    obj.getClass();
                    objectCountHashMap.put(obj, i2 + objectCountHashMap.get(obj));
                }
                i++;
            }
            if (objectCountHashMap.size != 0) {
                return new RegularImmutableMultiset(objectCountHashMap);
            }
            int i3 = ImmutableMultiset.a;
            return RegularImmutableMultiset.EMPTY;
        }
    }

    RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
        this.contents = objectCountHashMap;
        long j = 0;
        for (int i = 0; i < objectCountHashMap.size; i++) {
            j += (long) objectCountHashMap.getValue(i);
        }
        this.size = Ints.saturatedCast(j);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return this.contents.get(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        ObjectCountHashMap<E> objectCountHashMap = this.contents;
        MoreObjects.checkElementIndex(i, objectCountHashMap.size, "index");
        return new ObjectCountHashMap.MapEntry(i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public ImmutableSet<E> mo69elementSet() {
        ImmutableSet<E> immutableSet = this.elementSet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet2 = new ElementSet(null);
        this.elementSet = elementSet2;
        return elementSet2;
    }
}
