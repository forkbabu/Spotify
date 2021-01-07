package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: h22  reason: default package */
public final class h22 implements fjf<g22> {
    private final wlf<fwc> a;
    private final wlf<jz1> b;
    private final wlf<goc> c;
    private final wlf<cqe> d;
    private final wlf<ImmutableList<Integer>> e;

    public h22(wlf<fwc> wlf, wlf<jz1> wlf2, wlf<goc> wlf3, wlf<cqe> wlf4, wlf<ImmutableList<Integer>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static h22 a(wlf<fwc> wlf, wlf<jz1> wlf2, wlf<goc> wlf3, wlf<cqe> wlf4, wlf<ImmutableList<Integer>> wlf5) {
        return new h22(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g22(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
