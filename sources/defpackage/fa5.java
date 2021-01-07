package defpackage;

/* renamed from: fa5  reason: default package */
public final class fa5 implements fjf<ea5> {
    private final wlf<x85> a;

    public fa5(wlf<x85> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ea5(this.a.get());
    }
}
