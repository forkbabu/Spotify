package defpackage;

import android.app.Application;

/* renamed from: gyc  reason: default package */
public final class gyc implements fjf<fyc> {
    private final wlf<Application> a;

    public gyc(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fyc(this.a.get());
    }
}
