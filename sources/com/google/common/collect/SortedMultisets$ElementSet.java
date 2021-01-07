package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* access modifiers changed from: package-private */
public class SortedMultisets$ElementSet<E> extends Multisets$ElementSet<E> implements SortedSet<E> {
    private final SortedMultiset<E> multiset;

    SortedMultisets$ElementSet(SortedMultiset<E> sortedMultiset) {
        this.multiset = sortedMultiset;
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return this.multiset.comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        Multiset.Entry<E> firstEntry = this.multiset.firstEntry();
        if (firstEntry != null) {
            return firstEntry.getElement();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return this.multiset.mo37headMultiset(e, BoundType.OPEN).elementSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Multisets$5(this.multiset.entrySet().iterator());
    }

    @Override // java.util.SortedSet
    public E last() {
        Multiset.Entry<E> lastEntry = this.multiset.lastEntry();
        if (lastEntry != null) {
            return lastEntry.getElement();
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets$ElementSet
    /* renamed from: multiset */
    public Multiset mo74multiset() {
        return this.multiset;
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return this.multiset.subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return this.multiset.mo38tailMultiset(e, BoundType.CLOSED).elementSet();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets$ElementSet
    /* renamed from: multiset  reason: collision with other method in class */
    public final SortedMultiset<E> mo74multiset() {
        return this.multiset;
    }
}
