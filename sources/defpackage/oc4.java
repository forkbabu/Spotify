package defpackage;

import io.reactivex.a;
import io.reactivex.y;

/* renamed from: oc4  reason: default package */
public final class oc4 implements fjf<nc4> {
    private final wlf<gf4> a;
    private final wlf<jf4> b;
    private final wlf<y> c;
    private final wlf<bj9> d;
    private final wlf<b61> e;
    private final wlf<efa> f;
    private final wlf<a> g;
    private final wlf<b91> h;

    public oc4(wlf<gf4> wlf, wlf<jf4> wlf2, wlf<y> wlf3, wlf<bj9> wlf4, wlf<b61> wlf5, wlf<efa> wlf6, wlf<a> wlf7, wlf<b91> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nc4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
