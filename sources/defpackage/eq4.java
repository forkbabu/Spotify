package defpackage;

import android.content.Context;

/* renamed from: eq4  reason: default package */
public final class eq4 implements fjf<dq4> {
    private final wlf<Context> a;
    private final wlf<zp4> b;

    public eq4(wlf<Context> wlf, wlf<zp4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dq4(this.a.get(), this.b.get());
    }
}
