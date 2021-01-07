package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* access modifiers changed from: package-private */
public final class Sets$UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet<E> delegate;
    private transient Sets$UnmodifiableNavigableSet<E> descendingSet;
    private final SortedSet<E> unmodifiableDelegate;

    Sets$UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        navigableSet.getClass();
        this.delegate = navigableSet;
        this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return this.delegate.ceiling(e);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public Object mo25delegate() {
        return this.unmodifiableDelegate;
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        Iterator<E> descendingIterator = this.delegate.descendingIterator();
        descendingIterator.getClass();
        if (descendingIterator instanceof UnmodifiableIterator) {
            return (UnmodifiableIterator) descendingIterator;
        }
        return new Iterators$1(descendingIterator);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        Sets$UnmodifiableNavigableSet<E> sets$UnmodifiableNavigableSet = this.descendingSet;
        if (sets$UnmodifiableNavigableSet != null) {
            return sets$UnmodifiableNavigableSet;
        }
        Sets$UnmodifiableNavigableSet<E> sets$UnmodifiableNavigableSet2 = new Sets$UnmodifiableNavigableSet<>(this.delegate.descendingSet());
        this.descendingSet = sets$UnmodifiableNavigableSet2;
        sets$UnmodifiableNavigableSet2.descendingSet = this;
        return sets$UnmodifiableNavigableSet2;
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return this.delegate.floor(e);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return Collections2.unmodifiableNavigableSet(this.delegate.headSet(e, z));
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return this.delegate.higher(e);
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return this.delegate.lower(e);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return Collections2.unmodifiableNavigableSet(this.delegate.subSet(e, z, e2, z2));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return Collections2.unmodifiableNavigableSet(this.delegate.tailSet(e, z));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate  reason: collision with other method in class */
    public Collection mo71delegate() {
        return this.unmodifiableDelegate;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate  reason: collision with other method in class */
    public Set mo72delegate() {
        return this.unmodifiableDelegate;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate  reason: collision with other method in class */
    public SortedSet<E> mo73delegate() {
        return this.unmodifiableDelegate;
    }
}
