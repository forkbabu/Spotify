package com.google.common.collect;

import com.google.common.collect.Multiset;

/* access modifiers changed from: package-private */
public abstract class Multisets$EntrySet<E> extends Sets$ImprovedAbstractSet<Multiset.Entry<E>> {
    Multisets$EntrySet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        multiset().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Multiset.Entry)) {
            return false;
        }
        Multiset.Entry entry = (Multiset.Entry) obj;
        if (entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract Multiset<E> multiset();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (obj instanceof Multiset.Entry) {
            Multiset.Entry entry = (Multiset.Entry) obj;
            E e = (E) entry.getElement();
            int count = entry.getCount();
            if (count != 0) {
                return multiset().setCount(e, count, 0);
            }
        }
        return false;
    }
}
