package com.google.protobuf;

import com.google.protobuf.o;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class n extends c<Integer> implements o.f, RandomAccess {
    private static final n f;
    private int[] b;
    private int c;

    static {
        n nVar = new n();
        f = nVar;
        nVar.C();
    }

    n() {
        this.b = new int[10];
        this.c = 0;
    }

    private void d(int i, int i2) {
        int i3;
        c();
        if (i < 0 || i > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[je.g0(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = i2;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public static n e() {
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

    @Override // com.google.protobuf.o.f
    public int T1(int i) {
        f(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        d(i, ((Integer) obj).intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        collection.getClass();
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i = nVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                this.b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(nVar.b, 0, this.b, this.c, nVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.c != nVar.c) {
            return false;
        }
        int[] iArr = nVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        f(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public o.f p(int i) {
        if (i >= this.c) {
            return new n(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.o.f
    public void i1(int i) {
        d(this.c, i);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Integer.valueOf(this.b[i]))) {
                int[] iArr = this.b;
                System.arraycopy(iArr, i + 1, iArr, i, this.c - i);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        f(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.c;
    }

    private n(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        c();
        f(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.c - i);
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}
