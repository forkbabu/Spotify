package defpackage;

import android.content.Context;

/* renamed from: bfb  reason: default package */
public final class bfb implements fjf<afb> {
    private final wlf<Context> a;
    private final wlf<r2e> b;

    public bfb(wlf<Context> wlf, wlf<r2e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new afb(this.a.get(), this.b.get());
    }
}
