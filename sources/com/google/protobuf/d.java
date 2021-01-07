package com.google.protobuf;

import com.google.protobuf.o;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class d extends c<Boolean> implements o.a, RandomAccess {
    private static final d f;
    private boolean[] b;
    private int c;

    static {
        d dVar = new d();
        f = dVar;
        dVar.C();
    }

    d() {
        this.b = new boolean[10];
        this.c = 0;
    }

    private void d(int i, boolean z) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        boolean[] zArr = this.b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[je.g0(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
            this.b = zArr2;
        }
        this.b[i] = z;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public static d e() {
        return f;
    }

    private void f(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private String h(int i) {
        StringBuilder W0 = je.W0("Index:", i, ", Size:");
        W0.append(this.c);
        return W0.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        d(i, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        collection.getClass();
        if (!(collection instanceof d)) {
            return super.addAll(collection);
        }
        d dVar = (d) collection;
        int i = dVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.b;
            if (i3 > zArr.length) {
                this.b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(dVar.b, 0, this.b, this.c, dVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.o.a
    public void b0(boolean z) {
        d(this.c, z);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        if (this.c != dVar.c) {
            return false;
        }
        boolean[] zArr = dVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        f(i);
        return Boolean.valueOf(this.b[i]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + o.a(this.b[i2]);
        }
        return i;
    }

    @Override // com.google.protobuf.o.a
    public boolean o1(int i) {
        f(i);
        return this.b[i];
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Boolean.valueOf(this.b[i]))) {
                boolean[] zArr = this.b;
                System.arraycopy(zArr, i + 1, zArr, i, this.c - i);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        f(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.c;
    }

    @Override // com.google.protobuf.o.i, com.google.protobuf.o.a
    public o.a p(int i) {
        if (i >= this.c) {
            return new d(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    private d(boolean[] zArr, int i) {
        this.b = zArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        c();
        f(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        System.arraycopy(zArr, i + 1, zArr, i, this.c - i);
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
