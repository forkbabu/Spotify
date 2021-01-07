package defpackage;

/* renamed from: g0e  reason: default package */
public final class g0e implements n0e {
    private final boolean a;

    public g0e() {
        this.a = false;
    }

    public final boolean a() {
        return this.a;
    }

    public g0e(boolean z) {
        this.a = z;
    }

    public g0e(boolean z, int i) {
        this.a = (i & 1) != 0 ? false : z;
    }
}
