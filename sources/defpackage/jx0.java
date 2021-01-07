package defpackage;

import io.reactivex.y;

/* renamed from: jx0  reason: default package */
public final class jx0 implements fjf<ix0> {
    private final wlf<by0> a;
    private final wlf<hz0> b;
    private final wlf<ky0> c;
    private final wlf<y> d;
    private final wlf<te0> e;
    private final wlf<kx0> f;
    private final wlf<ny0> g;

    public jx0(wlf<by0> wlf, wlf<hz0> wlf2, wlf<ky0> wlf3, wlf<y> wlf4, wlf<te0> wlf5, wlf<kx0> wlf6, wlf<ny0> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static jx0 a(wlf<by0> wlf, wlf<hz0> wlf2, wlf<ky0> wlf3, wlf<y> wlf4, wlf<te0> wlf5, wlf<kx0> wlf6, wlf<ny0> wlf7) {
        return new jx0(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ix0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
