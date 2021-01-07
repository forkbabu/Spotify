package defpackage;

/* renamed from: mt0  reason: default package */
public final class mt0 implements fjf<lt0> {
    private final wlf<ere> a;
    private final wlf<ft0> b;

    public mt0(wlf<ere> wlf, wlf<ft0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lt0(this.a.get(), this.b.get());
    }
}
