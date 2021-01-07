package defpackage;

/* renamed from: ra4  reason: default package */
public final class ra4 implements fjf<g84> {
    private final wlf<Boolean> a;
    private final wlf<d84> b;

    public ra4(wlf<Boolean> wlf, wlf<d84> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g84(this.a.get().booleanValue(), false, this.b.get());
    }
}
