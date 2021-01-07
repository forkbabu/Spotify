package defpackage;

/* renamed from: t2  reason: default package */
public final class t2 {
    public static final t2 e = new t2(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private t2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static t2 a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new t2(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t2.class != obj.getClass()) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.d == t2Var.d && this.a == t2Var.a && this.c == t2Var.c && this.b == t2Var.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Insets{left=");
        V0.append(this.a);
        V0.append(", top=");
        V0.append(this.b);
        V0.append(", right=");
        V0.append(this.c);
        V0.append(", bottom=");
        return je.A0(V0, this.d, '}');
    }
}
