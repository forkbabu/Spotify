package defpackage;

/* renamed from: n32  reason: default package */
public final class n32 implements fjf<m32> {
    private final wlf<ina> a;
    private final wlf<d8a> b;

    public n32(wlf<ina> wlf, wlf<d8a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m32(this.a.get(), this.b.get());
    }
}
