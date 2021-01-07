package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class u4 extends c3<String> implements t4, RandomAccess {
    private static final u4 c;
    private final List<Object> b;

    static {
        u4 u4Var = new u4(10);
        c = u4Var;
        u4Var.b2();
    }

    public u4(int i) {
        this.b = new ArrayList(i);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgm) {
            zzgm zzgm = (zzgm) obj;
            zzgm.getClass();
            return zzgm.d() == 0 ? "" : zzgm.i(h4.a);
        }
        Charset charset = h4.a;
        return new String((byte[]) obj, h4.a);
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final t4 F() {
        return super.a() ? new p6(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.c3, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final List<?> b() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.measurement.c3, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        c();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m4
    public final /* synthetic */ m4 g(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new u4(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgm) {
            zzgm zzgm = (zzgm) obj;
            zzgm.getClass();
            String i2 = zzgm.d() == 0 ? "" : zzgm.i(h4.a);
            if (zzgm.n()) {
                this.b.set(i, i2);
            }
            return i2;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = h4.a;
        String str = new String(bArr, h4.a);
        if (t6.d(bArr)) {
            this.b.set(i, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final void j0(zzgm zzgm) {
        c();
        this.b.add(zzgm);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4
    public final Object r(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return d(this.b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.measurement.c3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof t4) {
            collection = ((t4) collection).b();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    private u4(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
