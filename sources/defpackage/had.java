package defpackage;

import android.app.Activity;

/* renamed from: had  reason: default package */
public final class had implements fjf<gad> {
    private final wlf<Activity> a;
    private final wlf<scd> b;

    public had(wlf<Activity> wlf, wlf<scd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gad(this.a.get(), this.b.get());
    }
}
