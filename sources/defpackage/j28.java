package defpackage;

import android.app.Activity;
import androidx.fragment.app.o;

/* renamed from: j28  reason: default package */
public final class j28 implements fjf<h28> {
    private final wlf<Activity> a;
    private final wlf<o> b;
    private final wlf<b18> c;
    private final wlf<s08> d;

    public j28(wlf<Activity> wlf, wlf<o> wlf2, wlf<b18> wlf3, wlf<s08> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h28(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
