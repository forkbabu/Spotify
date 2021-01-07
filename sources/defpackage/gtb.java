package defpackage;

/* renamed from: gtb  reason: default package */
public final class gtb implements fjf<ftb> {
    private final wlf<m41> a;
    private final wlf<ep2> b;

    public gtb(wlf<m41> wlf, wlf<ep2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ftb(this.a.get(), this.b.get());
    }
}
