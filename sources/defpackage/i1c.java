package defpackage;

import android.content.Context;

/* renamed from: i1c  reason: default package */
public final class i1c implements fjf<h1c> {
    private final wlf<t8a> a;
    private final wlf<Context> b;

    public i1c(wlf<t8a> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h1c(this.a, this.b);
    }
}
