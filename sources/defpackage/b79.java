package defpackage;

/* renamed from: b79  reason: default package */
public final class b79 implements fjf<faa> {
    private final wlf<wh0> a;
    private final wlf<xh0> b;

    public b79(wlf<wh0> wlf, wlf<xh0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new faa(this.a.get(), this.b.get());
    }
}
