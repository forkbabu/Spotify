package defpackage;

/* renamed from: t4b  reason: default package */
public final class t4b implements fjf<s4b> {
    private final wlf<g6b> a;
    private final wlf<e5b> b;

    public t4b(wlf<g6b> wlf, wlf<e5b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s4b(this.a.get(), this.b.get());
    }
}
