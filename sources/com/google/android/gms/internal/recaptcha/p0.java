package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class p0 extends r<String> implements o0, RandomAccess {
    private static final p0 c;
    private final List<Object> b;

    static {
        p0 p0Var = new p0(10);
        c = p0Var;
        p0Var.U();
    }

    public p0(int i) {
        this.b = new ArrayList(i);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzct) {
            zzct zzct = (zzct) obj;
            zzct.getClass();
            return zzct.d() == 0 ? "" : zzct.h(i0.a);
        }
        Charset charset = i0.a;
        return new String((byte[]) obj, i0.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.recaptcha.o0
    public final List<?> b() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        c();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.recaptcha.j0
    public final /* synthetic */ j0 g(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new p0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzct) {
            zzct zzct = (zzct) obj;
            zzct.getClass();
            String h = zzct.d() == 0 ? "" : zzct.h(i0.a);
            if (zzct.k()) {
                this.b.set(i, h);
            }
            return h;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = i0.a;
        String str = new String(bArr, i0.a);
        if (l2.b(bArr)) {
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

    @Override // com.google.android.gms.internal.recaptcha.o0
    public final o0 z0() {
        return super.a() ? new f2(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof o0) {
            collection = ((o0) collection).b();
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

    private p0(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
