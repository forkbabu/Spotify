package defpackage;

/* renamed from: y67  reason: default package */
public final class y67 implements fjf<x67> {
    private final wlf<ogc> a;
    private final wlf<z67> b;

    public y67(wlf<ogc> wlf, wlf<z67> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x67(this.a.get(), this.b.get());
    }
}
