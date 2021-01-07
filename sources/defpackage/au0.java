package defpackage;

/* renamed from: au0  reason: default package */
public final class au0 implements fjf<zt0> {
    private final wlf<ere> a;
    private final wlf<tt0> b;

    public au0(wlf<ere> wlf, wlf<tt0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zt0(this.a.get(), this.b.get());
    }
}
