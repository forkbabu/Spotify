package defpackage;

/* renamed from: dqd  reason: default package */
public final class dqd {
    private final long a;
    private final long b;

    public dqd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqd)) {
            return false;
        }
        dqd dqd = (dqd) obj;
        return this.a == dqd.a && this.b == dqd.b;
    }

    public int hashCode() {
        return (e.a(this.a) * 31) + e.a(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackProgress(position=");
        V0.append(this.a);
        V0.append(", duration=");
        return je.E0(V0, this.b, ")");
    }
}
