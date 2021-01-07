package defpackage;

import android.content.Context;

/* renamed from: a2e  reason: default package */
public final class a2e implements fjf<z1e> {
    private final wlf<w1e> a;
    private final wlf<Context> b;

    public a2e(wlf<w1e> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z1e(this.a.get(), this.b.get());
    }
}
