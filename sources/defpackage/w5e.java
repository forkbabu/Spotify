package defpackage;

import io.reactivex.y;

/* renamed from: w5e  reason: default package */
public final class w5e implements fjf<v5e> {
    private final wlf<y> a;
    private final wlf<j7e> b;
    private final wlf<x3e> c;

    public w5e(wlf<y> wlf, wlf<j7e> wlf2, wlf<x3e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v5e(this.a.get(), this.b.get(), this.c.get());
    }
}
