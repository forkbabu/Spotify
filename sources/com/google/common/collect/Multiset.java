package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        int getCount();

        E getElement();
    }

    int add(E e, int i);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    boolean add(E e);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    /* renamed from: elementSet */
    Set<E> mo69elementSet();

    Set<Entry<E>> entrySet();

    @Override // java.lang.Object, com.google.common.collect.Multiset
    boolean equals(Object obj);

    @Override // java.lang.Object, com.google.common.collect.Multiset
    int hashCode();

    int remove(Object obj, int i);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    int size();
}
