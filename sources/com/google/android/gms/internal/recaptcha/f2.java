package com.google.android.gms.internal.recaptcha;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class f2 extends AbstractList<String> implements o0, RandomAccess {
    private final o0 a;

    public f2(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // com.google.android.gms.internal.recaptcha.o0
    public final List<?> b() {
        return this.a.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new h2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new i2(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.recaptcha.o0
    public final o0 z0() {
        return this;
    }
}
