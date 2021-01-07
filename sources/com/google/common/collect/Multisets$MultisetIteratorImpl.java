package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Multiset;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class Multisets$MultisetIteratorImpl<E> implements Iterator<E> {
    private boolean canRemove;
    private Multiset.Entry<E> currentEntry;
    private final Iterator<Multiset.Entry<E>> entryIterator;
    private int laterCount;
    private final Multiset<E> multiset;
    private int totalCount;

    Multisets$MultisetIteratorImpl(Multiset<E> multiset2, Iterator<Multiset.Entry<E>> it) {
        this.multiset = multiset2;
        this.entryIterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.laterCount > 0 || this.entryIterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        if (hasNext()) {
            if (this.laterCount == 0) {
                Multiset.Entry<E> next = this.entryIterator.next();
                this.currentEntry = next;
                int count = next.getCount();
                this.laterCount = count;
                this.totalCount = count;
            }
            this.laterCount--;
            this.canRemove = true;
            return this.currentEntry.getElement();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        MoreObjects.checkState(this.canRemove, "no calls to next() since the last call to remove()");
        if (this.totalCount == 1) {
            this.entryIterator.remove();
        } else {
            this.multiset.remove(this.currentEntry.getElement());
        }
        this.totalCount--;
        this.canRemove = false;
    }
}
