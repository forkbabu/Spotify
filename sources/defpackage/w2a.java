package defpackage;

import io.reactivex.y;
import retrofit2.w;

/* renamed from: w2a  reason: default package */
public final class w2a implements fjf<v2a> {
    private final wlf<x2a> a;
    private final wlf<y> b;
    private final wlf<w> c;
    private final wlf<e0e> d;
    private final wlf<cqe> e;
    private final wlf<q2a> f;
    private final wlf<o2a> g;

    public w2a(wlf<x2a> wlf, wlf<y> wlf2, wlf<w> wlf3, wlf<e0e> wlf4, wlf<cqe> wlf5, wlf<q2a> wlf6, wlf<o2a> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v2a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
