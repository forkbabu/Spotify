package defpackage;

import defpackage.s1;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o1  reason: default package */
public final class o1<E> implements Collection<E>, Set<E> {
    private static final int[] n = new int[0];
    private static final Object[] o = new Object[0];
    private static Object[] p;
    private static int q;
    private static Object[] r;
    private static int s;
    private int[] a = n;
    Object[] b = o;
    int c = 0;
    private s1<E, E> f;

    private void c(int i) {
        if (i == 8) {
            synchronized (o1.class) {
                Object[] objArr = r;
                if (objArr != null) {
                    this.b = objArr;
                    r = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    s--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (o1.class) {
                Object[] objArr2 = p;
                if (objArr2 != null) {
                    this.b = objArr2;
                    p = (Object[]) objArr2[0];
                    this.a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    q--;
                    return;
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[i];
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (o1.class) {
                if (s < 10) {
                    objArr[0] = r;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    r = objArr;
                    s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (o1.class) {
                if (q < 10) {
                    objArr[0] = p;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    p = objArr;
                    q++;
                }
            }
        }
    }

    private int e(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = p1.a(this.a, i2, i);
        if (a2 < 0 || obj.equals(this.b[a2])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (obj.equals(this.b[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.a[i4] == i) {
            if (obj.equals(this.b[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private int f() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a2 = p1.a(this.a, i, 0);
        if (a2 < 0 || this.b[a2] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a2 - 1;
        while (i3 >= 0 && this.a[i3] == 0) {
            if (this.b[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = f();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = e(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.c;
        int[] iArr = this.a;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.b;
            c(i5);
            int[] iArr2 = this.a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.b, 0, objArr.length);
            }
            d(iArr, objArr, this.c);
        }
        int i6 = this.c;
        if (i3 < i6) {
            int[] iArr3 = this.a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.c - i3);
        }
        this.a[i3] = i;
        this.b[i3] = e;
        this.c++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o1<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.c;
        int[] iArr = this.a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            c(size);
            int i = this.c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i);
                System.arraycopy(objArr, 0, this.b, 0, this.c);
            }
            d(iArr, objArr, this.c);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.c;
        if (i != 0) {
            d(this.a, this.b, i);
            this.a = n;
            this.b = o;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                try {
                    if (!set.contains(this.b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E h(int i) {
        Object[] objArr = this.b;
        E e = (E) objArr[i];
        int i2 = this.c;
        if (i2 <= 1) {
            d(this.a, objArr, i2);
            this.a = n;
            this.b = o;
            this.c = 0;
        } else {
            int[] iArr = this.a;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.c = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i5, objArr2, i, this.c - i);
                }
                this.b[this.c] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                c(i3);
                this.c--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.a, 0, i);
                    System.arraycopy(objArr, 0, this.b, 0, i);
                }
                int i6 = this.c;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.a, i, i6 - i);
                    System.arraycopy(objArr, i7, this.b, i, this.c - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public E i(int i) {
        return (E) this.b[i];
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f == null) {
            this.f = new n1(this);
        }
        s1<E, E> s1Var = this.f;
        if (s1Var.b == null) {
            s1Var.b = new s1.c();
        }
        return s1Var.b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        h(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!collection.contains(this.b[i])) {
                h(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.b, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.lang.Object
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.c));
        }
        System.arraycopy(this.b, 0, tArr, 0, this.c);
        int length = tArr.length;
        int i = this.c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
