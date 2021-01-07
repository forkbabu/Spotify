package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Set;

public abstract class zzfb<E> extends zzet<E> implements Set<E> {
    private transient zzeu<E> b;

    zzfb() {
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public int hashCode() {
        return s.j(this);
    }

    public zzeu<E> i() {
        zzeu<E> zzeu = this.b;
        if (zzeu != null) {
            return zzeu;
        }
        zzff zzff = new zzff((zzfc) this);
        this.b = zzff;
        return zzff;
    }

    @Override // com.google.android.gms.internal.cast.zzet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
