package defpackage;

import android.app.Activity;

/* renamed from: uvc  reason: default package */
public final class uvc implements fjf<tvc> {
    private final wlf<Activity> a;

    public uvc(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tvc(this.a.get());
    }
}
