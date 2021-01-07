package defpackage;

/* renamed from: e84  reason: default package */
public final class e84 implements fjf<d84> {
    private final wlf<h84> a;
    private final wlf<o84> b;

    public e84(wlf<h84> wlf, wlf<o84> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d84(this.a, this.b);
    }
}
