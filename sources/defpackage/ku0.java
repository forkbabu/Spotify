package defpackage;

/* renamed from: ku0  reason: default package */
public final class ku0 implements fjf<ju0> {
    private final wlf<ere> a;
    private final wlf<hu0> b;

    public ku0(wlf<ere> wlf, wlf<hu0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ju0(this.a.get(), this.b.get());
    }
}
