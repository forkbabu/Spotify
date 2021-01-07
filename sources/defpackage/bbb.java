package defpackage;

/* renamed from: bbb  reason: default package */
public final class bbb implements fjf<abb> {
    private final wlf<vab> a;
    private final wlf<tab> b;
    private final wlf<xab> c;

    public bbb(wlf<vab> wlf, wlf<tab> wlf2, wlf<xab> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new abb(this.a.get(), this.b.get(), this.c.get());
    }
}
