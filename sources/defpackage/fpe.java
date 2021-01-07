package defpackage;

/* renamed from: fpe  reason: default package */
public final class fpe implements fjf<epe> {
    private final wlf<npe> a;
    private final wlf<ekd> b;

    public fpe(wlf<npe> wlf, wlf<ekd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new epe(this.a.get(), this.b.get());
    }
}
