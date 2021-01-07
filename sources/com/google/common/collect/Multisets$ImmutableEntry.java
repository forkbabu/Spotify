package com.google.common.collect;

import java.io.Serializable;

class Multisets$ImmutableEntry<E> extends Multisets$AbstractEntry<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final int count;
    private final E element;

    Multisets$ImmutableEntry(E e, int i) {
        this.element = e;
        this.count = i;
        Collections2.checkNonnegative(i, "count");
    }

    @Override // com.google.common.collect.Multiset.Entry
    public final int getCount() {
        return this.count;
    }

    @Override // com.google.common.collect.Multiset.Entry
    public final E getElement() {
        return this.element;
    }
}
