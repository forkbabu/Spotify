package defpackage;

import android.app.Activity;

/* renamed from: dq6  reason: default package */
public final class dq6 implements fjf<cq6> {
    private final wlf<Activity> a;
    private final wlf<jq6> b;
    private final wlf<kq6> c;

    public dq6(wlf<Activity> wlf, wlf<jq6> wlf2, wlf<kq6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cq6(this.a, this.b, this.c);
    }
}
