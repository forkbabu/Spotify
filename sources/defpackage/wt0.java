package defpackage;

/* renamed from: wt0  reason: default package */
public final class wt0 implements fjf<vt0> {
    private final wlf<ere> a;
    private final wlf<tt0> b;

    public wt0(wlf<ere> wlf, wlf<tt0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vt0(this.a.get(), this.b.get());
    }
}
