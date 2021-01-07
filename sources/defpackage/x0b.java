package defpackage;

/* renamed from: x0b  reason: default package */
public final class x0b implements fjf<w0b> {
    private final wlf<qz0> a;
    private final wlf<pz0> b;

    public x0b(wlf<qz0> wlf, wlf<pz0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w0b(this.a.get(), this.b.get());
    }
}
