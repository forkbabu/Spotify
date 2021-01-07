package defpackage;

/* renamed from: h5b  reason: default package */
public class h5b implements g5b {
    private g5b a;

    private h5b() {
    }

    public static h5b b() {
        return new h5b();
    }

    @Override // defpackage.g5b
    public void a() {
        g5b g5b = this.a;
        if (g5b != null) {
            g5b.a();
        }
    }

    public void c(g5b g5b) {
        this.a = g5b;
    }
}
