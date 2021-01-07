package defpackage;

import android.content.res.Resources;

/* renamed from: q34  reason: default package */
public final class q34 implements fjf<p34> {
    private final wlf<e61> a;
    private final wlf<b61> b;
    private final wlf<Resources> c;

    public q34(wlf<e61> wlf, wlf<b61> wlf2, wlf<Resources> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p34(this.a.get(), this.b.get(), this.c.get());
    }
}
