package defpackage;

/* renamed from: c47  reason: default package */
public final class c47 implements fjf<b47> {
    private final wlf<d47> a;
    private final wlf<g47> b;

    public c47(wlf<d47> wlf, wlf<g47> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b47(this.a, this.b);
    }
}
