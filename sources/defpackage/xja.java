package defpackage;

import android.app.Application;

/* renamed from: xja  reason: default package */
public final class xja implements fjf<wja> {
    private final wlf<Application> a;

    public xja(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wja(this.a.get());
    }
}
