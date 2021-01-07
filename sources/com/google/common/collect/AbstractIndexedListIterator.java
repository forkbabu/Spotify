package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    protected AbstractIndexedListIterator(int i) {
        MoreObjects.checkPositionIndex(0, i);
        this.size = i;
        this.position = 0;
    }

    /* access modifiers changed from: protected */
    public abstract E get(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.position < this.size;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.position;
            this.position = i + 1;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.position - 1;
            this.position = i;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.position - 1;
    }

    protected AbstractIndexedListIterator(int i, int i2) {
        MoreObjects.checkPositionIndex(i2, i);
        this.size = i;
        this.position = i2;
    }
}
