package com.google.common.collect;

import com.google.common.collect.Multiset;

/* access modifiers changed from: package-private */
public final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient ImmutableSortedMultiset<E> forward;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.forward = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return this.forward.count(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: descendingMultiset */
    public ImmutableSortedMultiset<E> mo36descendingMultiset() {
        return this.forward;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return this.forward.lastEntry();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        return this.forward.entrySet().asList().reverse().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: headMultiset */
    public ImmutableSortedMultiset<E> mo37headMultiset(E e, BoundType boundType) {
        return this.forward.mo38tailMultiset((ImmutableSortedMultiset<E>) e, boundType).mo36descendingMultiset();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return this.forward.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: tailMultiset */
    public ImmutableSortedMultiset<E> mo38tailMultiset(E e, BoundType boundType) {
        return this.forward.mo37headMultiset((ImmutableSortedMultiset<E>) e, boundType).mo36descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: descendingMultiset  reason: collision with other method in class */
    public SortedMultiset mo36descendingMultiset() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: headMultiset  reason: collision with other method in class */
    public SortedMultiset mo37headMultiset(Object obj, BoundType boundType) {
        return this.forward.mo38tailMultiset((ImmutableSortedMultiset<E>) obj, boundType).mo36descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: tailMultiset  reason: collision with other method in class */
    public SortedMultiset mo38tailMultiset(Object obj, BoundType boundType) {
        return this.forward.mo37headMultiset((ImmutableSortedMultiset<E>) obj, boundType).mo36descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public ImmutableSortedSet<E> mo69elementSet() {
        return this.forward.mo69elementSet().descendingSet();
    }
}
