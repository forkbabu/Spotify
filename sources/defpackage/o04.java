package defpackage;

import android.app.Application;

/* renamed from: o04  reason: default package */
public final class o04 implements fjf<n04> {
    private final wlf<Application> a;

    public o04(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n04(this.a.get());
    }
}
