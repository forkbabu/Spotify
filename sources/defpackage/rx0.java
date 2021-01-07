package defpackage;

import android.app.Activity;
import defpackage.px0;

/* renamed from: rx0  reason: default package */
public final class rx0 implements fjf<px0.b> {
    private final wlf<Activity> a;

    public rx0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new px0.b(this.a.get());
    }
}
