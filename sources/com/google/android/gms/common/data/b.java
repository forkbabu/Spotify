package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class b<T> implements Iterator<T> {
    @RecentlyNonNull
    protected final a<T> a;
    protected int b = -1;

    public b(@RecentlyNonNull a<T> aVar) {
        this.a = aVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.getCount() - 1;
    }

    @Override // java.util.Iterator
    @RecentlyNonNull
    public T next() {
        if (hasNext()) {
            a<T> aVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return aVar.get(i);
        }
        throw new NoSuchElementException(je.f0(46, "Cannot advance the iterator beyond ", this.b));
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
