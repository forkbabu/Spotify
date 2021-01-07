package defpackage;

/* renamed from: lic  reason: default package */
public final class lic implements fjf<kic> {
    private final wlf<ngc> a;
    private final wlf<etc> b;

    public lic(wlf<ngc> wlf, wlf<etc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kic(this.a.get(), this.b.get());
    }
}
