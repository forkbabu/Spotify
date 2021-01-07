package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {
    private transient Comparator<? super E> comparator;
    private transient NavigableSet<E> elementSet;
    private transient Set<Multiset.Entry<E>> entrySet;

    DescendingMultiset() {
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator2 = this.comparator;
        if (comparator2 != null) {
            return comparator2;
        }
        Ordering reverse = Ordering.from(AbstractSortedMultiset.this.comparator()).reverse();
        this.comparator = reverse;
        return reverse;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public Multiset<E> mo25delegate() {
        return AbstractSortedMultiset.this;
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: descendingMultiset */
    public SortedMultiset<E> mo36descendingMultiset() {
        return AbstractSortedMultiset.this;
    }

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        AnonymousClass1EntrySetImpl r0 = new Multisets$EntrySet<E>() {
            /* class com.google.common.collect.DescendingMultiset.AnonymousClass1EntrySetImpl */

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
            public Iterator<Multiset.Entry<E>> iterator() {
                return AbstractSortedMultiset.this.descendingEntryIterator();
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.Multisets$EntrySet
            public Multiset<E> multiset() {
                return DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractSortedMultiset.this.entrySet().size();
            }
        };
        this.entrySet = r0;
        return r0;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return AbstractSortedMultiset.this.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: headMultiset */
    public SortedMultiset<E> mo37headMultiset(E e, BoundType boundType) {
        return ((TreeMultiset) ((TreeMultiset) AbstractSortedMultiset.this).mo38tailMultiset(e, boundType)).mo36descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return AbstractSortedMultiset.this.firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        return AbstractSortedMultiset.this.pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        return AbstractSortedMultiset.this.pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return AbstractSortedMultiset.this.subMultiset(e2, boundType2, e, boundType).mo36descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: tailMultiset */
    public SortedMultiset<E> mo38tailMultiset(E e, BoundType boundType) {
        return ((TreeMultiset) ((TreeMultiset) AbstractSortedMultiset.this).mo37headMultiset(e, boundType)).mo36descendingMultiset();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // com.google.common.collect.ForwardingObject, java.lang.Object
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public NavigableSet<E> mo69elementSet() {
        NavigableSet<E> navigableSet = this.elementSet;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets$NavigableElementSet sortedMultisets$NavigableElementSet = new SortedMultisets$NavigableElementSet(this);
        this.elementSet = sortedMultisets$NavigableElementSet;
        return sortedMultisets$NavigableElementSet;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) Collections2.toArrayImpl(this, tArr);
    }
}
