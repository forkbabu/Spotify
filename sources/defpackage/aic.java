package defpackage;

import android.content.Context;

/* renamed from: aic  reason: default package */
public final class aic implements fjf<zhc> {
    private final wlf<Context> a;
    private final wlf<sna> b;
    private final wlf<xhc> c;
    private final wlf<oic> d;

    public aic(wlf<Context> wlf, wlf<sna> wlf2, wlf<xhc> wlf3, wlf<oic> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zhc(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
