package defpackage;

/* renamed from: l0b  reason: default package */
public final class l0b implements fjf<k0b> {
    private final wlf<m0b> a;
    private final wlf<s0b> b;
    private final wlf<d0b> c;

    public l0b(wlf<m0b> wlf, wlf<s0b> wlf2, wlf<d0b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0b(this.a.get(), this.b.get(), this.c.get());
    }
}
