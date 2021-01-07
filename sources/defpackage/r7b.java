package defpackage;

/* renamed from: r7b  reason: default package */
public final class r7b implements fjf<q7b> {
    private final wlf<qz0> a;
    private final wlf<pz0> b;

    public r7b(wlf<qz0> wlf, wlf<pz0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q7b(this.a.get(), this.b.get());
    }
}
