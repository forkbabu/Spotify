package defpackage;

/* renamed from: ge2  reason: default package */
public final class ge2 implements fjf<fe2> {
    private final wlf<zd2> a;
    private final wlf<le2> b;

    public ge2(wlf<zd2> wlf, wlf<le2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fe2(this.a.get(), this.b.get());
    }
}
