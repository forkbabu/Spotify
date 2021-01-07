package defpackage;

/* renamed from: dua  reason: default package */
public final class dua implements fjf<cua> {
    private final wlf<kua> a;
    private final wlf<oua> b;
    private final wlf<eua> c;
    private final wlf<hua> d;

    public dua(wlf<kua> wlf, wlf<oua> wlf2, wlf<eua> wlf3, wlf<hua> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cua(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
