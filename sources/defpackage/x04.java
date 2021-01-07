package defpackage;

import android.app.Application;

/* renamed from: x04  reason: default package */
public final class x04 implements fjf<w04> {
    private final wlf<Application> a;

    public x04(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w04(this.a.get());
    }
}
