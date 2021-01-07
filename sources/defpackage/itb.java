package defpackage;

import android.app.Activity;

/* renamed from: itb  reason: default package */
public final class itb implements fjf<htb> {
    private final wlf<Activity> a;
    private final wlf<nsb> b;

    public itb(wlf<Activity> wlf, wlf<nsb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new htb(this.a.get(), this.b.get());
    }
}
