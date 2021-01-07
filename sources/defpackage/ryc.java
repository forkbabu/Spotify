package defpackage;

/* renamed from: ryc  reason: default package */
public final class ryc implements fjf<qyc> {
    private final wlf<lyc> a;
    private final wlf<myc> b;

    public ryc(wlf<lyc> wlf, wlf<myc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qyc(this.a.get(), this.b.get());
    }
}
