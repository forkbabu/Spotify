package defpackage;

/* renamed from: fod  reason: default package */
public final class fod implements fjf<dod> {
    private final wlf<i1d> a;
    private final wlf<znd> b;

    public fod(wlf<i1d> wlf, wlf<znd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dod(this.a.get(), this.b.get());
    }
}
