package com.google.common.collect;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class Iterators$9 extends UnmodifiableIterator<T> {
    boolean done;
    final /* synthetic */ Object val$value;

    Iterators$9(Object obj) {
        this.val$value = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.done;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.done) {
            this.done = true;
            return (T) this.val$value;
        }
        throw new NoSuchElementException();
    }
}
