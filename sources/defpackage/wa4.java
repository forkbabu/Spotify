package defpackage;

import android.app.Activity;

/* renamed from: wa4  reason: default package */
public final class wa4 implements fjf<jg4> {
    private final wlf<Activity> a;
    private final wlf<hg4> b;
    private final wlf<Boolean> c;
    private final wlf<Boolean> d;

    public wa4(wlf<Activity> wlf, wlf<hg4> wlf2, wlf<Boolean> wlf3, wlf<Boolean> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jg4(this.a.get(), this.b.get(), this.c.get().booleanValue(), this.d.get().booleanValue());
    }
}
