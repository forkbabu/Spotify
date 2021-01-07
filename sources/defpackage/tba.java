package defpackage;

import android.content.Context;
import defpackage.sba;

/* renamed from: tba  reason: default package */
public final class tba implements fjf<sba> {
    private final wlf<Context> a;
    private final wlf<sba.a> b;

    public tba(wlf<Context> wlf, wlf<sba.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sba(this.a.get(), this.b.get());
    }
}
