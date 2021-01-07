package defpackage;

/* renamed from: xz9  reason: default package */
public final class xz9 implements fjf<faa> {
    private final wlf<wh0> a;
    private final wlf<xh0> b;

    public xz9(wlf<wh0> wlf, wlf<xh0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new faa(this.a.get(), this.b.get());
    }
}
