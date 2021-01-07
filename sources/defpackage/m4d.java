package defpackage;

import android.content.Context;

/* renamed from: m4d  reason: default package */
public final class m4d implements fjf<l4d> {
    private final wlf<Context> a;
    private final wlf<f4d> b;
    private final wlf<cfd> c;

    public m4d(wlf<Context> wlf, wlf<f4d> wlf2, wlf<cfd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l4d(this.a.get(), this.b.get(), this.c.get());
    }
}
