package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

final class x5<E> extends c3<E> implements RandomAccess {
    private static final x5<Object> f;
    private E[] b;
    private int c;

    static {
        x5<Object> x5Var = new x5<>(new Object[0], 0);
        f = x5Var;
        x5Var.b2();
    }

    private x5(E[] eArr, int i) {
        this.b = eArr;
        this.c = i;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        return je.h0(35, "Index:", i, ", Size:", this.c);
    }

    public static <E> x5<E> f() {
        return (x5<E>) f;
    }

    @Override // com.google.android.gms.internal.measurement.c3, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean add(E e) {
        c();
        int i = this.c;
        E[] eArr = this.b;
        if (i == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m4
    public final /* synthetic */ m4 g(int i) {
        if (i >= this.c) {
            return new x5(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        d(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        c();
        d(i);
        E[] eArr = this.b;
        E e = eArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        c();
        d(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        E[] eArr = this.b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[je.g0(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.b, i, eArr2, i + 1, this.c - i);
            this.b = eArr2;
        }
        this.b[i] = e;
        this.c++;
        ((AbstractList) this).modCount++;
    }
}
