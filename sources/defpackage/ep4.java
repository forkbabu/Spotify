package defpackage;

/* renamed from: ep4  reason: default package */
public final class ep4 implements fjf<dp4> {
    private final wlf<tn4> a;
    private final wlf<o4d> b;
    private final wlf<rn4> c;
    private final wlf<vn4> d;
    private final wlf<ln4> e;
    private final wlf<pn4> f;
    private final wlf<nn4> g;
    private final wlf<p4d> h;

    public ep4(wlf<tn4> wlf, wlf<o4d> wlf2, wlf<rn4> wlf3, wlf<vn4> wlf4, wlf<ln4> wlf5, wlf<pn4> wlf6, wlf<nn4> wlf7, wlf<p4d> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static ep4 a(wlf<tn4> wlf, wlf<o4d> wlf2, wlf<rn4> wlf3, wlf<vn4> wlf4, wlf<ln4> wlf5, wlf<pn4> wlf6, wlf<nn4> wlf7, wlf<p4d> wlf8) {
        return new ep4(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dp4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
