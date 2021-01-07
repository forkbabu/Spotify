package defpackage;

/* renamed from: y8f  reason: default package */
public final class y8f implements fjf<x8f> {
    private final wlf<ere> a;

    public y8f(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x8f(this.a.get());
    }
}
