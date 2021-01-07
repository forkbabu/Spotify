package defpackage;

/* renamed from: dq9  reason: default package */
public final class dq9 implements fjf<cq9> {
    private final wlf<gq9> a;
    private final wlf<w50> b;

    public dq9(wlf<gq9> wlf, wlf<w50> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cq9(this.a.get(), this.b.get());
    }
}
