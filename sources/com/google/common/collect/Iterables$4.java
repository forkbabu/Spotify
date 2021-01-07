package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class Iterables$4 extends FluentIterable<T> {
    final /* synthetic */ Predicate val$retainIfTrue;
    final /* synthetic */ Iterable val$unfiltered;

    Iterables$4(Iterable iterable, Predicate predicate) {
        this.val$unfiltered = iterable;
        this.val$retainIfTrue = predicate;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        Iterator it = this.val$unfiltered.iterator();
        Predicate predicate = this.val$retainIfTrue;
        it.getClass();
        predicate.getClass();
        return new Iterators$5(it, predicate);
    }
}
