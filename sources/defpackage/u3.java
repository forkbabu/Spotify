package defpackage;

/* renamed from: u3  reason: default package */
public class u3<F, S> {
    public final F a;
    public final S b;

    public u3(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        if (!e2.g(u3Var.a, this.a) || !e2.g(u3Var.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Pair{");
        V0.append(String.valueOf(this.a));
        V0.append(" ");
        V0.append(String.valueOf(this.b));
        V0.append("}");
        return V0.toString();
    }
}
