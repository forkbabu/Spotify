package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: iu6  reason: default package */
public final class iu6 implements fjf<ImmutableList<gu6>> {
    private final wlf<zw6> a;
    private final wlf<fx6> b;
    private final wlf<bx6> c;
    private final wlf<vx6> d;
    private final wlf<tx6> e;
    private final wlf<lx6> f;
    private final wlf<px6> g;
    private final wlf<tw6> h;
    private final wlf<dx6> i;
    private final wlf<jx6> j;
    private final wlf<xw6> k;
    private final wlf<nw6> l;
    private final wlf<rx6> m;
    private final wlf<rw6> n;
    private final wlf<hx6> o;
    private final wlf<vw6> p;
    private final wlf<pw6> q;
    private final wlf<nx6> r;

    public iu6(wlf<zw6> wlf, wlf<fx6> wlf2, wlf<bx6> wlf3, wlf<vx6> wlf4, wlf<tx6> wlf5, wlf<lx6> wlf6, wlf<px6> wlf7, wlf<tw6> wlf8, wlf<dx6> wlf9, wlf<jx6> wlf10, wlf<xw6> wlf11, wlf<nw6> wlf12, wlf<rx6> wlf13, wlf<rw6> wlf14, wlf<hx6> wlf15, wlf<vw6> wlf16, wlf<pw6> wlf17, wlf<nx6> wlf18) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
    }

    @Override // defpackage.wlf
    public Object get() {
        zw6 zw6 = this.a.get();
        fx6 fx6 = this.b.get();
        bx6 bx6 = this.c.get();
        vx6 vx6 = this.d.get();
        ImmutableList of = ImmutableList.of(this.l.get(), this.n.get(), zw6, this.g.get(), this.h.get(), fx6, this.i.get(), this.k.get(), this.p.get(), this.f.get(), bx6, vx6, this.e.get(), this.m.get(), this.j.get(), this.o.get(), this.q.get(), this.r.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
