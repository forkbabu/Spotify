package defpackage;

/* renamed from: mf2  reason: default package */
public final class mf2 implements fjf<lf2> {
    private final wlf<cqe> a;
    private final wlf<nf2> b;

    public mf2(wlf<cqe> wlf, wlf<nf2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lf2(this.a.get(), this.b.get());
    }
}
