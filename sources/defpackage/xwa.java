package defpackage;

import android.app.Activity;

/* renamed from: xwa  reason: default package */
public final class xwa implements fjf<wwa> {
    private final wlf<Activity> a;

    public xwa(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wwa(this.a.get());
    }
}
