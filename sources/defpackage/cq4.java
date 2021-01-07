package defpackage;

import android.content.Context;

/* renamed from: cq4  reason: default package */
public final class cq4 implements fjf<bq4> {
    private final wlf<Context> a;
    private final wlf<zp4> b;

    public cq4(wlf<Context> wlf, wlf<zp4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bq4(this.a.get(), this.b.get());
    }
}
