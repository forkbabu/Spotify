package defpackage;

import android.app.Activity;
import defpackage.sba;

/* renamed from: xl4  reason: default package */
public final class xl4 implements fjf<wl4> {
    private final wlf<Activity> a;
    private final wlf<sba.a> b;

    public xl4(wlf<Activity> wlf, wlf<sba.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wl4(this.a.get(), this.b.get());
    }
}
