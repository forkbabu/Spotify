package defpackage;

/* renamed from: s71  reason: default package */
public final class s71 implements fjf<b61> {
    private final wlf<w51> a;
    private final wlf<e61> b;

    public s71(wlf<w51> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b61(this.a.get(), this.b.get());
    }
}
