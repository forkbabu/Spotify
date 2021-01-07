package defpackage;

/* renamed from: wva  reason: default package */
public final class wva implements fjf<vva> {
    private final wlf<fsa> a;
    private final wlf<sua> b;
    private final wlf<ksa> c;
    private final wlf<wua> d;
    private final wlf<msa> e;
    private final wlf<yua> f;

    public wva(wlf<fsa> wlf, wlf<sua> wlf2, wlf<ksa> wlf3, wlf<wua> wlf4, wlf<msa> wlf5, wlf<yua> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static wva a(wlf<fsa> wlf, wlf<sua> wlf2, wlf<ksa> wlf3, wlf<wua> wlf4, wlf<msa> wlf5, wlf<yua> wlf6) {
        return new wva(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vva(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
