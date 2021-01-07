package defpackage;

/* renamed from: ge3  reason: default package */
public final class ge3 implements fjf<fe3> {
    private final wlf<zvd> a;
    private final wlf<yf3> b;

    public ge3(wlf<zvd> wlf, wlf<yf3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fe3(this.a.get(), ejf.a(this.b));
    }
}
