package defpackage;

import android.content.Context;

/* renamed from: q92  reason: default package */
public final class q92 implements fjf<p92> {
    private final wlf<Context> a;
    private final wlf<i92> b;

    public q92(wlf<Context> wlf, wlf<i92> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p92(this.a.get(), this.b.get());
    }
}
