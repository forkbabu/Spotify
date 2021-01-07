package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import java.util.Set;

/* access modifiers changed from: package-private */
public class Sets$FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
    Sets$FilteredSet(Set<E> set, Predicate<? super E> predicate) {
        super(set, predicate);
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public boolean equals(Object obj) {
        return Collections2.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public int hashCode() {
        return Collections2.hashCodeImpl(this);
    }
}
