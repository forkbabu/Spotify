package com.google.protobuf;

import com.google.protobuf.o;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class y<E> extends c<E> {
    private static final y<Object> c;
    private final List<E> b;

    static {
        y<Object> yVar = new y<>();
        c = yVar;
        yVar.C();
    }

    y() {
        this.b = new ArrayList(10);
    }

    public static <E> y<E> d() {
        return (y<E>) c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        c();
        this.b.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return this.b.get(i);
    }

    @Override // com.google.protobuf.o.i, com.google.protobuf.o.a
    public o.i p(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new y(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        c();
        E remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        c();
        E e2 = this.b.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.b.size();
    }

    private y(List<E> list) {
        this.b = list;
    }
}
