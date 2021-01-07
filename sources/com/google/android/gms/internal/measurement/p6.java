package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class p6 extends AbstractList<String> implements t4, RandomAccess {
    private final t4 a;

    public p6(t4 t4Var) {
        this.a = t4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final t4 F() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final List<?> b() {
        return this.a.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new r6(this);
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final void j0(zzgm zzgm) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new o6(this, i);
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final Object r(int i) {
        return this.a.r(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
