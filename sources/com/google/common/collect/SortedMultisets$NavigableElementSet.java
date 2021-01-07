package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

/* access modifiers changed from: package-private */
public class SortedMultisets$NavigableElementSet<E> extends SortedMultisets$ElementSet<E> implements NavigableSet<E> {
    SortedMultisets$NavigableElementSet(SortedMultiset<E> sortedMultiset) {
        super(sortedMultiset);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return (E) Collections2.access$100(mo74multiset().mo38tailMultiset(e, BoundType.CLOSED).firstEntry());
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return ((SortedMultisets$ElementSet) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return new SortedMultisets$NavigableElementSet(mo74multiset().mo36descendingMultiset());
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return (E) Collections2.access$100(mo74multiset().mo37headMultiset(e, BoundType.CLOSED).lastEntry());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return new SortedMultisets$NavigableElementSet(mo74multiset().mo37headMultiset(e, BoundType.forBoolean(z)));
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return (E) Collections2.access$100(mo74multiset().mo38tailMultiset(e, BoundType.OPEN).firstEntry());
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return (E) Collections2.access$100(mo74multiset().mo37headMultiset(e, BoundType.OPEN).lastEntry());
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return (E) Collections2.access$100(mo74multiset().pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return (E) Collections2.access$100(mo74multiset().pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return new SortedMultisets$NavigableElementSet(mo74multiset().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return new SortedMultisets$NavigableElementSet(mo74multiset().mo38tailMultiset(e, BoundType.forBoolean(z)));
    }
}
