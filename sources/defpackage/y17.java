package defpackage;

/* renamed from: y17  reason: default package */
public final class y17 implements fjf<x17> {
    private final wlf<yj6> a;
    private final wlf<ere> b;

    public y17(wlf<yj6> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x17(this.a.get(), this.b.get());
    }
}
