package defpackage;

import io.reactivex.y;

/* renamed from: u5e  reason: default package */
public final class u5e implements fjf<t5e> {
    private final wlf<h7e> a;
    private final wlf<y> b;
    private final wlf<x3e> c;

    public u5e(wlf<h7e> wlf, wlf<y> wlf2, wlf<x3e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t5e(this.a.get(), this.b.get(), this.c.get());
    }
}
