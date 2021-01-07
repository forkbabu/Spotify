package defpackage;

import android.content.Context;

/* renamed from: rba  reason: default package */
public final class rba implements fjf<qba> {
    private final wlf<Context> a;
    private final wlf<sba> b;

    public rba(wlf<Context> wlf, wlf<sba> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qba(this.a.get(), this.b.get());
    }
}
