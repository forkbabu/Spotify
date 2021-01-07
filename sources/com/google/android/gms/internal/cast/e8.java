package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class e8 extends AbstractList<String> implements g6, RandomAccess {
    private final g6 a;

    public e8(g6 g6Var) {
        this.a = g6Var;
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final Object S0(int i) {
        return this.a.S0(i);
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final List<?> V0() {
        return this.a.V0();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new h8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new d8(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final g6 t0() {
        return this;
    }
}
