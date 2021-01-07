package defpackage;

/* renamed from: u1  reason: default package */
public class u1<E> implements Cloneable {
    private static final Object n = new Object();
    private boolean a;
    private int[] b;
    private Object[] c;
    private int f;

    public u1() {
        this(10);
    }

    private void e() {
        int i = this.f;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != n) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.f = i2;
    }

    public void b(int i, E e) {
        int i2 = this.f;
        if (i2 == 0 || i > this.b[i2 - 1]) {
            if (this.a && i2 >= this.b.length) {
                e();
            }
            int i3 = this.f;
            if (i3 >= this.b.length) {
                int e2 = p1.e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = iArr;
                this.c = objArr;
            }
            this.b[i3] = i;
            this.c[i3] = e;
            this.f = i3 + 1;
            return;
        }
        n(i, e);
    }

    public void c() {
        int i = this.f;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f = 0;
        this.a = false;
    }

    /* renamed from: d */
    public u1<E> clone() {
        try {
            u1<E> u1Var = (u1) super.clone();
            u1Var.b = (int[]) this.b.clone();
            u1Var.c = (Object[]) this.c.clone();
            return u1Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E f(int i) {
        return g(i, null);
    }

    public E g(int i, E e) {
        int a2 = p1.a(this.b, this.f, i);
        if (a2 >= 0) {
            Object[] objArr = this.c;
            if (objArr[a2] != n) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public int j(int i) {
        if (this.a) {
            e();
        }
        return p1.a(this.b, this.f, i);
    }

    public int k(E e) {
        if (this.a) {
            e();
        }
        for (int i = 0; i < this.f; i++) {
            if (this.c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int m(int i) {
        if (this.a) {
            e();
        }
        return this.b[i];
    }

    public void n(int i, E e) {
        int a2 = p1.a(this.b, this.f, i);
        if (a2 >= 0) {
            this.c[a2] = e;
            return;
        }
        int i2 = a2 ^ -1;
        int i3 = this.f;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == n) {
                this.b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            e();
            i2 = p1.a(this.b, this.f, i) ^ -1;
        }
        int i4 = this.f;
        if (i4 >= this.b.length) {
            int e2 = p1.e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.c = objArr2;
        }
        int i5 = this.f;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f - i2);
        }
        this.b[i2] = i;
        this.c[i2] = e;
        this.f++;
    }

    public void o(int i) {
        Object[] objArr;
        Object obj;
        int a2 = p1.a(this.b, this.f, i);
        if (a2 >= 0 && (objArr = this.c)[a2] != (obj = n)) {
            objArr[a2] = obj;
            this.a = true;
        }
    }

    public void p(int i) {
        Object[] objArr = this.c;
        Object obj = objArr[i];
        Object obj2 = n;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public int q() {
        if (this.a) {
            e();
        }
        return this.f;
    }

    public E r(int i) {
        if (this.a) {
            e();
        }
        return (E) this.c[i];
    }

    @Override // java.lang.Object
    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        for (int i = 0; i < this.f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m(i));
            sb.append('=');
            E r = r(i);
            if (r != this) {
                sb.append((Object) r);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public u1(int i) {
        this.a = false;
        if (i == 0) {
            this.b = p1.a;
            this.c = p1.c;
            return;
        }
        int e = p1.e(i);
        this.b = new int[e];
        this.c = new Object[e];
    }
}
