package com.google.common.collect;

import java.util.Iterator;

/* access modifiers changed from: package-private */
public abstract class TransformedIterator<F, T> implements Iterator<T> {
    final Iterator<? extends F> backingIterator;

    TransformedIterator(Iterator<? extends F> it) {
        it.getClass();
        this.backingIterator = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.common.collect.TransformedIterator<F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        return (T) transform(this.backingIterator.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.backingIterator.remove();
    }

    /* access modifiers changed from: package-private */
    public abstract T transform(F f);
}
