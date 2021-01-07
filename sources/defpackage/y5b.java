package defpackage;

/* renamed from: y5b  reason: default package */
public final class y5b implements fjf<x5b> {
    private final wlf<vz0> a;
    private final wlf<sg0<hva, b91>> b;

    public y5b(wlf<vz0> wlf, wlf<sg0<hva, b91>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x5b(this.a.get(), this.b.get());
    }
}
