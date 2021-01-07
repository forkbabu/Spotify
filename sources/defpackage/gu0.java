package defpackage;

/* renamed from: gu0  reason: default package */
public final class gu0 implements fjf<fu0> {
    private final wlf<ere> a;
    private final wlf<bu0> b;

    public gu0(wlf<ere> wlf, wlf<bu0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fu0(this.a.get(), this.b.get());
    }
}
