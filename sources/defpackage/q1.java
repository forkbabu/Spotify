package defpackage;

/* renamed from: q1  reason: default package */
public class q1<E> implements Cloneable {
    private static final Object n = new Object();
    private boolean a;
    private long[] b;
    private Object[] c;
    private int f;

    public q1() {
        this(10);
    }

    private void f() {
        int i = this.f;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != n) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.f = i2;
    }

    public void b(long j, E e) {
        int i = this.f;
        if (i == 0 || j > this.b[i - 1]) {
            if (this.a && i >= this.b.length) {
                f();
            }
            int i2 = this.f;
            if (i2 >= this.b.length) {
                int f2 = p1.f(i2 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = jArr;
                this.c = objArr;
            }
            this.b[i2] = j;
            this.c[i2] = e;
            this.f = i2 + 1;
            return;
        }
        o(j, e);
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
    public q1<E> clone() {
        try {
            q1<E> q1Var = (q1) super.clone();
            q1Var.b = (long[]) this.b.clone();
            q1Var.c = (Object[]) this.c.clone();
            return q1Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(long j) {
        if (this.a) {
            f();
        }
        return p1.b(this.b, this.f, j) >= 0;
    }

    public E g(long j) {
        return j(j, null);
    }

    public E j(long j, E e) {
        int b2 = p1.b(this.b, this.f, j);
        if (b2 >= 0) {
            Object[] objArr = this.c;
            if (objArr[b2] != n) {
                return (E) objArr[b2];
            }
        }
        return e;
    }

    public int k(long j) {
        if (this.a) {
            f();
        }
        return p1.b(this.b, this.f, j);
    }

    public boolean m() {
        return r() == 0;
    }

    public long n(int i) {
        if (this.a) {
            f();
        }
        return this.b[i];
    }

    public void o(long j, E e) {
        int b2 = p1.b(this.b, this.f, j);
        if (b2 >= 0) {
            this.c[b2] = e;
            return;
        }
        int i = b2 ^ -1;
        int i2 = this.f;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == n) {
                this.b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.a && i2 >= this.b.length) {
            f();
            i = p1.b(this.b, this.f, j) ^ -1;
        }
        int i3 = this.f;
        if (i3 >= this.b.length) {
            int f2 = p1.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr;
            this.c = objArr2;
        }
        int i4 = this.f;
        if (i4 - i != 0) {
            long[] jArr3 = this.b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f - i);
        }
        this.b[i] = j;
        this.c[i] = e;
        this.f++;
    }

    public void p(long j) {
        Object[] objArr;
        Object obj;
        int b2 = p1.b(this.b, this.f, j);
        if (b2 >= 0 && (objArr = this.c)[b2] != (obj = n)) {
            objArr[b2] = obj;
            this.a = true;
        }
    }

    public void q(int i) {
        Object[] objArr = this.c;
        Object obj = objArr[i];
        Object obj2 = n;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public int r() {
        if (this.a) {
            f();
        }
        return this.f;
    }

    public E s(int i) {
        if (this.a) {
            f();
        }
        return (E) this.c[i];
    }

    @Override // java.lang.Object
    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        for (int i = 0; i < this.f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(n(i));
            sb.append('=');
            E s = s(i);
            if (s != this) {
                sb.append((Object) s);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public q1(int i) {
        this.a = false;
        if (i == 0) {
            this.b = p1.b;
            this.c = p1.c;
            return;
        }
        int f2 = p1.f(i);
        this.b = new long[f2];
        this.c = new Object[f2];
    }
}
