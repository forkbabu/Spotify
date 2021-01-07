package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class Iterables$6 extends FluentIterable<T> {
    final /* synthetic */ Iterable val$iterable;
    final /* synthetic */ int val$numberToSkip;

    Iterables$6(Iterable iterable, int i) {
        this.val$iterable = iterable;
        this.val$numberToSkip = i;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        Iterable iterable = this.val$iterable;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.val$numberToSkip), list.size()).iterator();
        }
        final Iterator it = iterable.iterator();
        int i = this.val$numberToSkip;
        it.getClass();
        MoreObjects.checkArgument(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new Iterator<T>(this) {
            /* class com.google.common.collect.Iterables$6.AnonymousClass1 */
            boolean atStart = true;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t = (T) it.next();
                this.atStart = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                MoreObjects.checkState(!this.atStart, "no calls to next() since the last call to remove()");
                it.remove();
            }
        };
    }
}
