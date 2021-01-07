package defpackage;

/* renamed from: it0  reason: default package */
public final class it0 implements fjf<ht0> {
    private final wlf<ere> a;
    private final wlf<ft0> b;

    public it0(wlf<ere> wlf, wlf<ft0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ht0(this.a.get(), this.b.get());
    }
}
