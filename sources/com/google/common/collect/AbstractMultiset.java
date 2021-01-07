package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* access modifiers changed from: package-private */
public abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    private transient Set<E> elementSet;
    private transient Set<Multiset.Entry<E>> entrySet;

    /* access modifiers changed from: package-private */
    public class ElementSet extends Multisets$ElementSet<E> {
        ElementSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<E> iterator() {
            return AbstractMultiset.this.elementIterator();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets$ElementSet
        /* renamed from: multiset */
        public Multiset<E> mo74multiset() {
            return AbstractMultiset.this;
        }
    }

    /* access modifiers changed from: package-private */
    public class EntrySet extends Multisets$EntrySet<E> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Multiset.Entry<E>> iterator() {
            return AbstractMultiset.this.entryIterator();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets$EntrySet
        public Multiset<E> multiset() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractMultiset.this.distinctElements();
        }
    }

    AbstractMultiset() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            Multiset multiset = (Multiset) collection;
            if (multiset instanceof AbstractMapBasedMultiset) {
                AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) multiset;
                if (abstractMapBasedMultiset.isEmpty()) {
                    return false;
                }
                for (int firstIndex = abstractMapBasedMultiset.backingMap.firstIndex(); firstIndex >= 0; firstIndex = abstractMapBasedMultiset.backingMap.nextIndex(firstIndex)) {
                    add(abstractMapBasedMultiset.backingMap.getKey(firstIndex), abstractMapBasedMultiset.backingMap.getValue(firstIndex));
                }
            } else if (multiset.isEmpty()) {
                return false;
            } else {
                for (Multiset.Entry<E> entry : multiset.entrySet()) {
                    add(entry.getElement(), entry.getCount());
                }
            }
            return true;
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return Collections2.addAll(this, collection.iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    /* access modifiers changed from: package-private */
    public Set<E> createElementSet() {
        return new ElementSet();
    }

    /* access modifiers changed from: package-private */
    public abstract int distinctElements();

    /* access modifiers changed from: package-private */
    public abstract Iterator<E> elementIterator();

    @Override // com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public Set<E> mo69elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Collection, java.lang.Object, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Collections2.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.lang.Object, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo69elementSet();
        }
        return mo69elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo69elementSet();
        }
        return mo69elementSet().retainAll(collection);
    }

    @Override // com.google.common.collect.Multiset
    public int setCount(E e, int i) {
        Collections2.checkNonnegative(i, "count");
        int count = count(e);
        int i2 = i - count;
        if (i2 > 0) {
            add(e, i2);
        } else if (i2 < 0) {
            remove(e, -i2);
        }
        return count;
    }

    @Override // java.util.AbstractCollection, java.lang.Object
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public boolean setCount(E e, int i, int i2) {
        Collections2.checkNonnegative(i, "oldCount");
        Collections2.checkNonnegative(i2, "newCount");
        if (count(e) != i) {
            return false;
        }
        setCount(e, i2);
        return true;
    }
}
