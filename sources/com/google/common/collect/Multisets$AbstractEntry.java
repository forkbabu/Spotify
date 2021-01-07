package com.google.common.collect;

import com.google.common.collect.Multiset;

/* access modifiers changed from: package-private */
public abstract class Multisets$AbstractEntry<E> implements Multiset.Entry<E> {
    Multisets$AbstractEntry() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Multiset.Entry)) {
            return false;
        }
        Multiset.Entry entry = (Multiset.Entry) obj;
        if (getCount() != entry.getCount() || !rw.equal(getElement(), entry.getElement())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        E element = getElement();
        if (element == null) {
            i = 0;
        } else {
            i = element.hashCode();
        }
        return i ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(getElement());
        int count = getCount();
        if (count == 1) {
            return valueOf;
        }
        return valueOf + " x " + count;
    }
}
