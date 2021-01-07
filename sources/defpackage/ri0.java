package defpackage;

import android.app.Activity;

/* renamed from: ri0  reason: default package */
public final class ri0 implements fjf<v8> {
    private final wlf<Activity> a;

    public ri0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v8(this.a.get(), null);
    }
}
