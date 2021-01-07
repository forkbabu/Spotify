package defpackage;

/* renamed from: aob  reason: default package */
public final class aob implements fjf<qjd> {
    private final wlf<ajd> a;
    private final wlf<fjd> b;

    public aob(wlf<ajd> wlf, wlf<fjd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qjd(this.a.get(), this.b.get());
    }
}
