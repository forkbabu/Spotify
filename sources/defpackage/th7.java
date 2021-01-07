package defpackage;

/* renamed from: th7  reason: default package */
public class th7 {
    private static final long[] c = {172800000, 604800000};
    private final uh7 a;
    private final cqe b;

    public th7(uh7 uh7, cqe cqe) {
        this.a = uh7;
        this.b = cqe;
    }

    public long a() {
        int b2 = this.a.b();
        long[] jArr = c;
        if (b2 >= jArr.length) {
            return Long.MAX_VALUE;
        }
        return this.a.a() + jArr[b2];
    }

    public boolean b() {
        return this.a.b() < c.length;
    }

    public boolean c() {
        return a() < this.b.d();
    }
}
