package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Iterators$ConcatenatedIterator<T> implements Iterator<T> {
    private Iterator<? extends T> iterator = Iterators$ArrayItr.EMPTY;
    private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;
    private Iterator<? extends T> toRemove;
    private Iterator<? extends Iterator<? extends T>> topMetaIterator;

    Iterators$ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
        it.getClass();
        this.topMetaIterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Iterator<? extends Iterator<? extends T>> it;
        while (true) {
            Iterator<? extends T> it2 = this.iterator;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator<? extends Iterator<? extends T>> it3 = this.topMetaIterator;
                if (it3 != null && it3.hasNext()) {
                    it = this.topMetaIterator;
                    break;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                if (deque == null || deque.isEmpty()) {
                    break;
                }
                this.topMetaIterator = this.metaIterators.removeFirst();
            }
            it = null;
            this.topMetaIterator = it;
            if (it == null) {
                return false;
            }
            Iterator<? extends T> it4 = (Iterator) it.next();
            this.iterator = it4;
            if (it4 instanceof Iterators$ConcatenatedIterator) {
                Iterators$ConcatenatedIterator iterators$ConcatenatedIterator = (Iterators$ConcatenatedIterator) it4;
                this.iterator = iterators$ConcatenatedIterator.iterator;
                if (this.metaIterators == null) {
                    this.metaIterators = new ArrayDeque();
                }
                this.metaIterators.addFirst(this.topMetaIterator);
                if (iterators$ConcatenatedIterator.metaIterators != null) {
                    while (!iterators$ConcatenatedIterator.metaIterators.isEmpty()) {
                        this.metaIterators.addFirst(iterators$ConcatenatedIterator.metaIterators.removeLast());
                    }
                }
                this.topMetaIterator = iterators$ConcatenatedIterator.topMetaIterator;
            }
        }
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            Iterator<? extends T> it = this.iterator;
            this.toRemove = it;
            return (T) it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        MoreObjects.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
        this.toRemove.remove();
        this.toRemove = null;
    }
}
