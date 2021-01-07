package defpackage;

import android.app.Application;

/* renamed from: zja  reason: default package */
public final class zja implements fjf<yja> {
    private final wlf<Application> a;

    public zja(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yja(this.a.get());
    }
}
