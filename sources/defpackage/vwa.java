package defpackage;

import android.app.Activity;

/* renamed from: vwa  reason: default package */
public final class vwa implements fjf<uwa> {
    private final wlf<Activity> a;
    private final wlf<wwa> b;

    public vwa(wlf<Activity> wlf, wlf<wwa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uwa(this.a.get(), this.b.get());
    }
}
