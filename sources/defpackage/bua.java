package defpackage;

/* renamed from: bua  reason: default package */
public final class bua implements fjf<aua> {
    private final wlf<kua> a;
    private final wlf<oua> b;
    private final wlf<eua> c;
    private final wlf<hua> d;
    private final wlf<Integer> e;

    public bua(wlf<kua> wlf, wlf<oua> wlf2, wlf<eua> wlf3, wlf<hua> wlf4, wlf<Integer> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aua(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().intValue());
    }
}
