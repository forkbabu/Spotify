package defpackage;

import android.app.Activity;
import androidx.fragment.app.o;

/* renamed from: d18  reason: default package */
public final class d18 implements fjf<c18> {
    private final wlf<Activity> a;
    private final wlf<o> b;
    private final wlf<b18> c;

    public d18(wlf<Activity> wlf, wlf<o> wlf2, wlf<b18> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c18(this.a.get(), this.b.get(), this.c.get());
    }
}
