package defpackage;

/* renamed from: st0  reason: default package */
public final class st0 implements fjf<rt0> {
    private final wlf<ere> a;
    private final wlf<nt0> b;

    public st0(wlf<ere> wlf, wlf<nt0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rt0(this.a.get(), this.b.get());
    }
}
