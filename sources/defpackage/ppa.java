package defpackage;

/* renamed from: ppa  reason: default package */
public final class ppa implements fjf<opa> {
    private final wlf<Integer> a;
    private final wlf<npa> b;

    public ppa(wlf<Integer> wlf, wlf<npa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new opa(this.a.get().intValue(), ejf.a(this.b));
    }
}
