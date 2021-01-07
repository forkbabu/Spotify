package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.SortedSet;

/* access modifiers changed from: package-private */
public class Sets$FilteredSortedSet<E> extends Sets$FilteredSet<E> implements SortedSet<E> {
    Sets$FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        super(sortedSet, predicate);
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return ((SortedSet) this.unfiltered).comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return (E) Collections2.find(this.unfiltered.iterator(), this.predicate);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return new Sets$FilteredSortedSet(((SortedSet) this.unfiltered).headSet(e), this.predicate);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.SortedSet
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E last() {
        /*
            r3 = this;
            java.util.Collection<E> r0 = r3.unfiltered
            java.util.SortedSet r0 = (java.util.SortedSet) r0
        L_0x0004:
            java.lang.Object r1 = r0.last()
            com.google.common.base.Predicate<? super E> r2 = r3.predicate
            boolean r2 = r2.apply(r1)
            if (r2 == 0) goto L_0x0011
            return r1
        L_0x0011:
            java.util.SortedSet r0 = r0.headSet(r1)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Sets$FilteredSortedSet.last():java.lang.Object");
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return new Sets$FilteredSortedSet(((SortedSet) this.unfiltered).subSet(e, e2), this.predicate);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return new Sets$FilteredSortedSet(((SortedSet) this.unfiltered).tailSet(e), this.predicate);
    }
}
