package defpackage;

/* renamed from: na1  reason: default package */
public final class na1 {
    private final boolean a;
    private final sa1 b;

    private na1(boolean z, sa1 sa1) {
        this.a = z;
        this.b = sa1;
    }

    public static na1 a(sa1 sa1) {
        return new na1(true, sa1);
    }

    public static na1 f() {
        return new na1(false, null);
    }

    public static na1 g(sa1 sa1) {
        return new na1(false, sa1);
    }

    public sa1 b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.a && this.b != null;
    }

    public boolean e() {
        return !this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || na1.class != obj.getClass()) {
            return false;
        }
        na1 na1 = (na1) obj;
        if (this.a != na1.a) {
            return false;
        }
        sa1 sa1 = this.b;
        sa1 sa12 = na1.b;
        return sa1 == null ? sa12 == null : sa1.equals(sa12);
    }

    public int hashCode() {
        int i = (this.a ? 1 : 0) * 31;
        sa1 sa1 = this.b;
        return i + (sa1 != null ? sa1.hashCode() : 0);
    }
}
