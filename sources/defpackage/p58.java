package defpackage;

/* renamed from: p58  reason: default package */
public final class p58 implements fjf<o58> {
    private final wlf<c8b> a;
    private final wlf<k8b> b;
    private final wlf<p8b> c;

    public p58(wlf<c8b> wlf, wlf<k8b> wlf2, wlf<p8b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o58(this.a.get(), this.b.get(), this.c.get());
    }
}
