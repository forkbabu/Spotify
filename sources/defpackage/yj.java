package defpackage;

/* renamed from: yj  reason: default package */
public final class yj {
    public static final yj c = new yj(0, 0);
    public final long a;
    public final long b;

    public yj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yj.class != obj.getClass()) {
            return false;
        }
        yj yjVar = (yj) obj;
        if (this.a == yjVar.a && this.b == yjVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("[timeUs=");
        V0.append(this.a);
        V0.append(", position=");
        return je.E0(V0, this.b, "]");
    }
}
