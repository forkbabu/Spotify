package defpackage;

import android.app.Activity;

/* renamed from: r08  reason: default package */
public final class r08 implements fjf<q08> {
    private final wlf<o08> a;
    private final wlf<b18> b;
    private final wlf<Activity> c;

    public r08(wlf<o08> wlf, wlf<b18> wlf2, wlf<Activity> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q08(this.a.get(), this.b.get(), this.c.get());
    }
}
