package defpackage;

import android.app.Application;

/* renamed from: iq5  reason: default package */
public final class iq5 implements fjf<hq5> {
    private final wlf<Application> a;

    public iq5(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hq5(this.a.get());
    }
}
