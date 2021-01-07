package defpackage;

/* renamed from: ab4  reason: default package */
public final class ab4 implements fjf<g84> {
    private final wlf<Boolean> a;
    private final wlf<Boolean> b;
    private final wlf<d84> c;

    public ab4(wlf<Boolean> wlf, wlf<Boolean> wlf2, wlf<d84> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g84(this.a.get().booleanValue(), this.b.get().booleanValue(), this.c.get());
    }
}
