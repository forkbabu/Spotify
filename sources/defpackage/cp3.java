package defpackage;

import android.app.Application;

/* renamed from: cp3  reason: default package */
public final class cp3 implements fjf<zo3> {
    private final wlf<Application> a;

    public cp3(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zo3(this.a.get());
    }
}
