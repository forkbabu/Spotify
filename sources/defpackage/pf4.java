package defpackage;

/* renamed from: pf4  reason: default package */
public final class pf4 implements fjf<of4> {
    private final wlf<vf4> a;

    public pf4(wlf<vf4> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new of4(this.a.get());
    }
}
