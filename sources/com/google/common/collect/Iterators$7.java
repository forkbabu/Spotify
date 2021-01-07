package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class Iterators$7 implements Iterator<T> {
    private int count;
    final /* synthetic */ Iterator val$iterator;
    final /* synthetic */ int val$limitSize;

    Iterators$7(int i, Iterator it) {
        this.val$limitSize = i;
        this.val$iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.count < this.val$limitSize && this.val$iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.count++;
            return (T) this.val$iterator.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.val$iterator.remove();
    }
}
