package defpackage;

/* renamed from: p7b  reason: default package */
public final class p7b implements fjf<o7b> {
    private final wlf<qz0> a;
    private final wlf<pz0> b;

    public p7b(wlf<qz0> wlf, wlf<pz0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o7b(this.a.get(), this.b.get());
    }
}
