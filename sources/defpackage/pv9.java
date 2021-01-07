package defpackage;

import android.app.Application;
import defpackage.ov9;

/* renamed from: pv9  reason: default package */
public final class pv9 implements fjf<ov9> {
    private final wlf<Application> a;
    private final wlf<ov9.a> b;
    private final wlf<dv9> c;
    private final wlf<lv9> d;
    private final wlf<jv9> e;
    private final wlf<gv9> f;

    public pv9(wlf<Application> wlf, wlf<ov9.a> wlf2, wlf<dv9> wlf3, wlf<lv9> wlf4, wlf<jv9> wlf5, wlf<gv9> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ov9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
