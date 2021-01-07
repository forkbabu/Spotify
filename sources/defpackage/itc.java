package defpackage;

import android.content.Context;

/* renamed from: itc  reason: default package */
public final class itc implements fjf<htc> {
    private final wlf<Context> a;
    private final wlf<apa> b;

    public itc(wlf<Context> wlf, wlf<apa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new htc(this.a.get(), this.b.get());
    }
}
