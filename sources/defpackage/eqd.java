package defpackage;

/* renamed from: eqd  reason: default package */
public final class eqd {
    private final int a;
    private final int b;

    public eqd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqd)) {
            return false;
        }
        eqd eqd = (eqd) obj;
        return this.a == eqd.a && this.b == eqd.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NowPlayingInsets(top=");
        V0.append(this.a);
        V0.append(", bottom=");
        return je.B0(V0, this.b, ")");
    }
}
