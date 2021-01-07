package defpackage;

import android.app.Activity;
import defpackage.px0;

/* renamed from: qx0  reason: default package */
public final class qx0 implements fjf<px0.a> {
    private final wlf<Activity> a;

    public qx0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new px0.a(this.a.get());
    }
}
