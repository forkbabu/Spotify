package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

public interface SortedMultiset<E> extends Object<E>, SortedIterable<E> {
    @Override // com.google.common.collect.SortedIterable
    Comparator<? super E> comparator();

    /* renamed from: descendingMultiset */
    SortedMultiset<E> mo36descendingMultiset();

    NavigableSet<E> elementSet();

    Set<Multiset.Entry<E>> entrySet();

    Multiset.Entry<E> firstEntry();

    /* renamed from: headMultiset */
    SortedMultiset<E> mo37headMultiset(E e, BoundType boundType);

    Multiset.Entry<E> lastEntry();

    Multiset.Entry<E> pollFirstEntry();

    Multiset.Entry<E> pollLastEntry();

    SortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    /* renamed from: tailMultiset */
    SortedMultiset<E> mo38tailMultiset(E e, BoundType boundType);
}
