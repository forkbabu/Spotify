package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public class Lists$OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final E first;
    final E[] rest;

    Lists$OnePlusArrayList(E e, E[] eArr) {
        this.first = e;
        eArr.getClass();
        this.rest = eArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        MoreObjects.checkElementIndex(i, size(), "index");
        return i == 0 ? this.first : this.rest[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return Ints.saturatedCast(((long) this.rest.length) + ((long) 1));
    }
}
