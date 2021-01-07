package defpackage;

import android.app.Activity;

/* renamed from: vx0  reason: default package */
public final class vx0 implements fjf<ux0> {
    private final wlf<Activity> a;
    private final wlf<Boolean> b;

    public vx0(wlf<Activity> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ux0(this.a.get(), this.b.get().booleanValue());
    }
}
