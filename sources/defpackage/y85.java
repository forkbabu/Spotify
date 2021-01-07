package defpackage;

/* renamed from: y85  reason: default package */
public final class y85 implements fjf<x85> {
    private final wlf<h81> a;
    private final wlf<ia5> b;
    private final wlf<Boolean> c;
    private final wlf<w85> d;

    public y85(wlf<h81> wlf, wlf<ia5> wlf2, wlf<Boolean> wlf3, wlf<w85> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x85(this.a, this.b.get(), this.c.get().booleanValue(), this.d.get());
    }
}
