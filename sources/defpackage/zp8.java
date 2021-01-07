package defpackage;

import android.app.Activity;

/* renamed from: zp8  reason: default package */
public final class zp8 implements fjf<Boolean> {
    private final wlf<Activity> a;

    public zp8(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().getIntent().getBooleanExtra("update_mode", false));
    }
}
