package defpackage;

import android.app.Activity;

/* renamed from: jy0  reason: default package */
public final class jy0 implements fjf<iy0> {
    private final wlf<Activity> a;

    public jy0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iy0(this.a.get());
    }
}
