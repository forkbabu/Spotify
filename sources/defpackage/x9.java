package defpackage;

/* renamed from: x9  reason: default package */
public class x9 {
    public final String a;
    public final int b;

    public x9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        if (this.b != x9Var.b) {
            return false;
        }
        return this.a.equals(x9Var.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
