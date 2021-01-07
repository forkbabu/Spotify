package defpackage;

/* renamed from: ou0  reason: default package */
public final class ou0 implements fjf<nu0> {
    private final wlf<ere> a;
    private final wlf<hu0> b;

    public ou0(wlf<ere> wlf, wlf<hu0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nu0(this.a.get(), this.b.get());
    }
}
