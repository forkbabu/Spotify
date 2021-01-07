package defpackage;

/* renamed from: tnc  reason: default package */
public final class tnc {
    public static final tnc d = new tnc(0, 0, 0);
    public static final tnc e = new tnc(-1, -1, -1);
    private final long a;
    private final long b;
    private final long c;

    public tnc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnc)) {
            return false;
        }
        tnc tnc = (tnc) obj;
        return this.a == tnc.a && this.b == tnc.b && this.c == tnc.c;
    }

    public int hashCode() {
        return (((e.a(this.a) * 31) + e.a(this.b)) * 31) + e.a(this.c);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastTrailerPlayerState(duration=");
        V0.append(this.a);
        V0.append(", position=");
        V0.append(this.b);
        V0.append(", timestamp=");
        return je.E0(V0, this.c, ")");
    }
}
