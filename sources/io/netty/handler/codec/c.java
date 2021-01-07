package io.netty.handler.codec;

import io.netty.util.Recycler;
import java.util.AbstractList;
import java.util.RandomAccess;

final class c extends AbstractList<Object> implements RandomAccess {
    private static final Recycler<c> n = new a();
    private final Recycler.e<c> a;
    private int b;
    private Object[] c = new Object[16];
    private boolean f;

    static class a extends Recycler<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.Recycler
        public c k(Recycler.e<c> eVar) {
            return new c(eVar, null);
        }
    }

    c(Recycler.e eVar, a aVar) {
        this.a = eVar;
    }

    private void c() {
        Object[] objArr = this.c;
        int length = objArr.length << 1;
        if (length >= 0) {
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.c = objArr2;
            return;
        }
        throw new OutOfMemoryError();
    }

    private void e(int i, Object obj) {
        this.c[i] = obj;
        this.f = true;
    }

    static c h() {
        return n.j();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        if (obj != null) {
            try {
                e(this.b, obj);
            } catch (IndexOutOfBoundsException unused) {
                c();
                e(this.b, obj);
            }
            this.b++;
            return true;
        }
        throw new NullPointerException("element");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public void clear() {
        this.b = 0;
    }

    /* access modifiers changed from: package-private */
    public Object d(int i) {
        return this.c[i];
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        if (i < this.b) {
            return this.c[i];
        }
        throw new IndexOutOfBoundsException();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        for (int i = 0; i < this.b; i++) {
            this.c[i] = null;
        }
        this.b = 0;
        this.f = false;
        this.a.a(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int i2 = this.b;
        if (i < i2) {
            Object[] objArr = this.c;
            Object obj = objArr[i];
            int i3 = (i2 - i) - 1;
            if (i3 > 0) {
                System.arraycopy(objArr, i + 1, objArr, i, i3);
            }
            Object[] objArr2 = this.c;
            int i4 = this.b - 1;
            this.b = i4;
            objArr2[i4] = null;
            return obj;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException("element");
        } else if (i < this.b) {
            Object[] objArr = this.c;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            this.f = true;
            return obj2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        if (obj != null) {
            int i2 = this.b;
            if (i < i2) {
                if (i2 == this.c.length) {
                    c();
                }
                int i3 = this.b;
                if (i != i3 - 1) {
                    Object[] objArr = this.c;
                    System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
                }
                this.c[i] = obj;
                this.f = true;
                this.b++;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("element");
    }
}
