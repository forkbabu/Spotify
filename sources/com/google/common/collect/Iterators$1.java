package com.google.common.collect;

import java.util.Iterator;

final class Iterators$1 extends UnmodifiableIterator<T> {
    final /* synthetic */ Iterator val$iterator;

    Iterators$1(Iterator it) {
        this.val$iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) this.val$iterator.next();
    }
}
