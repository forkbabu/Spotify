package defpackage;

import android.app.Activity;

/* renamed from: na4  reason: default package */
public final class na4 implements fjf<jg4> {
    private final wlf<Activity> a;
    private final wlf<hg4> b;
    private final wlf<Boolean> c;

    public na4(wlf<Activity> wlf, wlf<hg4> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jg4(this.a.get(), this.b.get(), this.c.get().booleanValue(), false);
    }
}
