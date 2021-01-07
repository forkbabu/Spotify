package defpackage;

/* renamed from: haa  reason: default package */
public final class haa implements fjf<gaa> {
    private final wlf<wh0> a;
    private final wlf<xh0> b;

    public haa(wlf<wh0> wlf, wlf<xh0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gaa(this.a, this.b);
    }
}
