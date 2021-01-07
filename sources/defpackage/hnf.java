package defpackage;

import java.util.Iterator;

/* renamed from: hnf  reason: default package */
public class hnf implements Iterable<Integer>, zmf {
    private final int a;
    private final int b;
    private final int c;

    public hnf(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.a = i;
            this.b = bmf.a(i, i2, i3);
            this.c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof hnf) {
            if (!isEmpty() || !((hnf) obj).isEmpty()) {
                hnf hnf = (hnf) obj;
                if (!(this.a == hnf.a && this.b == hnf.b && this.c == hnf.c)) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        if (this.c > 0) {
            if (this.a > this.b) {
                return true;
            }
        } else if (this.a < this.b) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new inf(this.a, this.b, this.c);
    }

    @Override // java.lang.Object
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            i = this.c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            i = -this.c;
        }
        sb.append(i);
        return sb.toString();
    }
}
