package com.google.common.collect;

import java.util.Collection;

/* access modifiers changed from: package-private */
public abstract class Multisets$ElementSet<E> extends Sets$ImprovedAbstractSet<E> {
    Multisets$ElementSet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        mo74multiset().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return mo74multiset().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return mo74multiset().containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return mo74multiset().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: multiset */
    public abstract Multiset<E> mo74multiset();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return mo74multiset().remove(obj, Integer.MAX_VALUE) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return mo74multiset().entrySet().size();
    }
}
