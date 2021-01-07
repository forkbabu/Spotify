package defpackage;

import android.app.Activity;

/* renamed from: jfa  reason: default package */
public final class jfa implements fjf<efa> {
    private final wlf<ffa> a;
    private final wlf<Activity> b;

    public jfa(wlf<ffa> wlf, wlf<Activity> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        efa a2 = this.a.get().a(this.b.get().getClass().getSimpleName());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
