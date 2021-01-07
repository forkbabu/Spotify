package defpackage;

import android.app.Application;

/* renamed from: zp5  reason: default package */
public final class zp5 implements fjf<yp5> {
    private final wlf<Application> a;

    public zp5(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yp5(this.a.get());
    }
}
