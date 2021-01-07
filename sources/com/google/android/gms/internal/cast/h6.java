package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class h6 extends t4<String> implements g6, RandomAccess {
    private static final h6 c;
    private final List<Object> b;

    static {
        h6 h6Var = new h6(10);
        c = h6Var;
        h6Var.B();
    }

    public h6(int i) {
        this.b = new ArrayList(i);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzlb) {
            zzlb zzlb = (zzlb) obj;
            zzlb.getClass();
            return zzlb.size() == 0 ? "" : zzlb.c(v5.a);
        }
        Charset charset = v5.a;
        return new String((byte[]) obj, v5.a);
    }

    @Override // com.google.android.gms.internal.cast.z5
    public final /* synthetic */ z5 H0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new h6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final Object S0(int i) {
        return this.b.get(i);
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final List<?> V0() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        c();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzlb) {
            zzlb zzlb = (zzlb) obj;
            zzlb.getClass();
            String c2 = zzlb.size() == 0 ? "" : zzlb.c(v5.a);
            if (zzlb.k()) {
                this.b.set(i, c2);
            }
            return c2;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = v5.a;
        String str = new String(bArr, v5.a);
        if (j8.c(bArr)) {
            this.b.set(i, str);
        }
        return str;
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

    @Override // com.google.android.gms.internal.cast.g6
    public final g6 t0() {
        return super.f0() ? new e8(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof g6) {
            collection = ((g6) collection).V0();
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

    private h6(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
