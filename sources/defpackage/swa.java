package defpackage;

import android.app.Activity;

/* renamed from: swa  reason: default package */
public final class swa implements fjf<rwa> {
    private final wlf<Activity> a;
    private final wlf<wwa> b;

    public swa(wlf<Activity> wlf, wlf<wwa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rwa(this.a.get(), this.b.get());
    }
}
