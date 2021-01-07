package defpackage;

/* renamed from: fne  reason: default package */
public final class fne implements fjf<ene> {
    private final wlf<gne> a;
    private final wlf<cte> b;

    public fne(wlf<gne> wlf, wlf<cte> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ene(this.a.get(), this.b.get());
    }
}
