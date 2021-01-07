package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class Iterables$7 extends FluentIterable<T> {
    final /* synthetic */ Iterable val$iterable;
    final /* synthetic */ int val$limitSize;

    Iterables$7(Iterable iterable, int i) {
        this.val$iterable = iterable;
        this.val$limitSize = i;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        Iterator it = this.val$iterable.iterator();
        int i = this.val$limitSize;
        it.getClass();
        MoreObjects.checkArgument(i >= 0, "limit is negative");
        return new Iterators$7(i, it);
    }
}
