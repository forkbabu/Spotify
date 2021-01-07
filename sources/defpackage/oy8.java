package defpackage;

import android.app.Application;

/* renamed from: oy8  reason: default package */
public final class oy8 implements fjf<ny8> {
    private final wlf<Application> a;

    public oy8(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ny8(this.a.get());
    }
}
